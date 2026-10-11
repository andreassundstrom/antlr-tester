grammar Json;

// Parser rules
// Parser rules måste börja med liten bokstav
jp_json_base: jp_object | jp_array;
jp_object: BEGIN_OBJECT (jp_object_property VALUE_SEPARATOR?)+ END_OBJECT;
jp_object_property: jp_object_property_key NAME_SEPARATOR jp_object_property_value;
jp_object_property_key: PROPERTY_NAME_START_END STRING_VALUE PROPERTY_NAME_START_END;
jp_object_property_value: PROPERTY_NAME_START_END STRING_VALUE PROPERTY_NAME_START_END;
jp_array: jp_number_array | jp_string_array;
jp_number_array: BEGIN_ARRAY jp_number_value+ END_ARRAY;
jp_string_array: BEGIN_ARRAY (PROPERTY_NAME_START_END jp_string_value PROPERTY_NAME_START_END)+ END_ARRAY;
jp_number_value: NUMBER_VALUE;
jp_string_value: STRING_VALUE;

// Lexer rules
// Token names måste börja med stor bokstav!
BEGIN_ARRAY: '[';
END_ARRAY: ']';
PROPERTY_NAME_START_END: '"' | '\'';
BEGIN_OBJECT: '{';
END_OBJECT: '}';
NUMBER_VALUE: [0-9]+;
STRING_VALUE: [a-zA-Z]+;
NAME_SEPARATOR: ':';
VALUE_SEPARATOR: ',' -> skip;
WS: [ \t\r\n]+ -> skip;