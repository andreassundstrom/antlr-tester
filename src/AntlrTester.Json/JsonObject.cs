namespace AntlrTester.Json
{
    public class JsonObject : JsonBase
    {
        public JsonObject(Dictionary<string, string> properties)
        {
            Properties = properties;
        }

        public Dictionary<string, string> Properties { get; }
    }
}
