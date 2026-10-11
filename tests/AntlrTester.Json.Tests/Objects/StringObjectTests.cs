namespace AntlrTester.Json.Tests.Objects
{
    public class StringObjectTests
    {
        [Fact]
        public void OneProperty()
        {
            var expected = new JsonObject(new Dictionary<string, string> {
                { "some", "prop" }
            });

            string sample = "{\"some\":\"prop\"}";
            var result = JP.ParseJson(sample);
            var jsonObject = Assert.IsType<JsonObject>(result);
            Assert.Equivalent(expected, jsonObject, true);
        }

        [Fact]
        public void OnePropertySingleQuote()
        {
            var expected = new JsonObject(new Dictionary<string, string> {
                { "some", "prop" }
            });

            string sample = @"
            {
                'some':'prop'
            }";
            var result = JP.ParseJson(sample);
            var jsonObject = Assert.IsType<JsonObject>(result);
            Assert.Equivalent(expected, jsonObject, true);
        }

        [Fact]
        public void MultipleProperties()
        {
            var expected = new JsonObject(new Dictionary<string, string> {
                { "some", "prop" },
                { "another", "property" },
            });

            string sample = @"
            {
                ""some"":""prop"",
                ""another"":""property""
            }";
            var result = JP.ParseJson(sample);
            var jsonObject = Assert.IsType<JsonObject>(result);
            Assert.Equivalent(expected, jsonObject, true);
        }


        [Fact]
        public void MultiplePropertiesSingleQuote()
        {
            var expected = new JsonObject(new Dictionary<string, string> {
                { "some", "prop" },
                { "another", "property" },
            });

            string sample = @"
            {
                'some':'prop',
                'another':'property',
            }";
            var result = JP.ParseJson(sample);
            var jsonObject = Assert.IsType<JsonObject>(result);
            Assert.Equivalent(expected, jsonObject, true);
        }
    }
}
