namespace AntlrTester.Json
{
    public abstract class JsonArray : JsonBase
    {
        protected JsonArray(List<JsonNumber> numbers)
        {
            this.numbers = numbers;
        }
        protected JsonArray(List<JsonString> strings)
        {
            this.strings = strings;
        }

        protected List<JsonNumber> numbers { get; set; } = [];
        protected List<JsonString> strings { get; set; } = [];
    }

    public class JsonNumberArray : JsonArray
    {
        public JsonNumberArray(List<JsonNumber> numbers) : base(numbers)
        {
        }

        public List<JsonNumber> Numbers => numbers;
    }

    public class JsonStringArray : JsonArray
    {
        public JsonStringArray(List<JsonString> strings) : base(strings)
        {
        }

        public List<JsonString> Strings => strings;
    }
}
