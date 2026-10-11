namespace AntlrTester.Json.Tests.Arrays
{
    public class StringValueTest
    {
        [Fact]
        public void OneCharacter()
        {
            var expected = new JsonStringArray([
                    new JsonString("a"),
                ]);

            string sample = @"[""a""]";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }
        [Fact]
        public void OneCharacterSingleQuote()
        {
            var expected = new JsonStringArray([
                    new JsonString("a"),
                ]);

            string sample = "['a']";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }

        [Fact]
        public void TwoCharacter()
        {
            var expected = new JsonStringArray([
                    new JsonString("a"),
                    new JsonString("b"),
                ]);

            string sample = @"[""a"",""b""]";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }
        [Fact]
        public void TwoCharactersSingleQuote()
        {
            var expected = new JsonStringArray([
                    new JsonString("a"),
                    new JsonString("b"),
                ]);

            string sample = "['a','b']";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }

        [Fact]
        public void OneWord()
        {
            var expected = new JsonStringArray([
                    new JsonString("Some"),
                ]);

            string sample = @"[""Some""]";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }

        [Fact]
        public void OneWordSingleQuote()
        {
            var expected = new JsonStringArray([
                    new JsonString("Some"),
                ]);

            string sample = "['Some']";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }

        [Fact]
        public void TwoWords()
        {
            var expected = new JsonStringArray([
                    new JsonString("Some"),
                    new JsonString("Word"),
                ]);

            string sample = @"[""Some"",""Word""]";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }

        [Fact]
        public void TwoWordsSingleQuote()
        {
            var expected = new JsonStringArray([
                    new JsonString("Some"),
                    new JsonString("Word"),
                ]);

            string sample = "['Some','Word']";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }
    }
}
