namespace AntlrTester.Json.Tests.Arrays
{
    public class NumberValueTests
    {
        [Fact]
        public void OneNumber()
        {
            var expected = new JsonNumberArray([
                    new JsonNumber(1),
                ]);
            string sample = "[1]";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }

        [Fact]
        public void TwoNumbers()
        {
            var expected = new JsonNumberArray([
                    new JsonNumber(1),
                    new JsonNumber(2),
                ]);
            string sample = "[1,2]";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }
        [Fact]
        public void TwoNumbersWithWS()
        {
            var expected = new JsonNumberArray([
                    new JsonNumber(1),
                    new JsonNumber(2),
                ]);
            string sample = "[  1 , 2  ]";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }

        [Fact]
        public void MultipleNumbers()
        {
            var expected = new JsonNumberArray([
                    new JsonNumber(1),
                    new JsonNumber(2),
                    new JsonNumber(512),
                    new JsonNumber(3000),
                ]);
            string sample = "[  1 , 2, 512, 3000  ]";
            var result = JP.ParseJson(sample);
            Assert.Equivalent(expected, result, true);
        }
    }
}
