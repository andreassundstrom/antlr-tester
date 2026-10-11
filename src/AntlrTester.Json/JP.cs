using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

namespace AntlrTester.Json;

public class JP : JsonBaseVisitor<JsonBase?>
{
    public override JsonBase? VisitJp_object([NotNull] JsonParser.Jp_objectContext context)
    {
        Dictionary<string, string> props = [];
        if (context.jp_object_property() != null)
        {
            foreach (var property in context.jp_object_property())
            {
                var key = property.jp_object_property_key().STRING_VALUE().GetText();
                var value = property.jp_object_property_value().STRING_VALUE().GetText();
                props.Add(key, value);
            }
            return new JsonObject(props);
        }

        return null;
    }

    public override JsonBase? VisitJp_array([NotNull] JsonParser.Jp_arrayContext context)
    {
        if (context.jp_number_array() != null)
        {
            var numbers = new List<JsonNumber>();

            foreach (var val in context.jp_number_array().jp_number_value())
            {
                var number = int.Parse(val.NUMBER_VALUE().GetText());
                numbers.Add(new JsonNumber(number));
            }
            return new JsonNumberArray(numbers);
        }

        if (context.jp_string_array() != null)
        {
            var numbers = new List<JsonString>();

            foreach (var val in context.jp_string_array().jp_string_value())
            {
                var stringValue = val.STRING_VALUE().GetText();
                numbers.Add(new JsonString(stringValue));
            }
            return new JsonStringArray(numbers);
        }

        return null;
    }

    public static JsonBase? ParseJson(string input)
    {
        var stream = new AntlrInputStream(input);
        var lexer = new JsonLexer(stream);
        var tokens = new CommonTokenStream(lexer);
        var jsonParser = new JsonParser(tokens);
        var result = jsonParser.jp_json_base();
        var jp = new JP();
        var jsonArray = jp.Visit(result);
        return jsonArray;
    }
}