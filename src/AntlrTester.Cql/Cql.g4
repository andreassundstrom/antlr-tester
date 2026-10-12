grammar Cql;

cql: select_clause column_list from_clause QUERY_TERMINATOR;
select_clause: SELECT;
column_list: column_name ( ',' column_name)*;
column_name: COLUMN_DEFINITION;
from_clause: FROM ('\'')* file_name ('\'')*;
file_name:  ('./')* FILEPATH;

SELECT: 'SELECT';
FROM: 'FROM';
COLUMN_DEFINITION: [a-zA-Z0-9]+ | '*';
FILEPATH: [a-zA-Z0-9.]+;
QUERY_TERMINATOR: ';';
WS: [ \t\r\n]+ -> skip;