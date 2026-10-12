namespace AntlrTester.Cql.Tests
{
    public class CqlParserTests
    {
        [Fact]
        public void ParsesQueryCorrect()
        {
            string cql = @"
            SELECT
                some,
                col,
                name
            FROM myfile.csv;
";

            var result = Cql.Query(cql);
            Assert.NotNull(result);
            Assert.Equal("myfile.csv", result.FilePath);
            Assert.Equivalent(new string[] { "some", "col", "name" }, result.ColumnList);
        }

        [Fact]
        public void ParsesQueryCorrectWithSingleTicks()
        {
            string cql = @"
            SELECT
                some,
                col,
                name
            FROM 'myfile.csv';
";

            var result = Cql.Query(cql);
            Assert.NotNull(result);
            Assert.Equal("myfile.csv", result.FilePath);
            Assert.Equivalent(new string[] { "some", "col", "name" }, result.ColumnList);
        }

        [Fact]
        public void ParsesQueryCorrectWithSingleTicksAndRelativePath()
        {
            string cql = @"
            SELECT
                some,
                col,
                name
            FROM './myfile.csv';
";

            var result = Cql.Query(cql);
            Assert.NotNull(result);
            Assert.Equal("./myfile.csv", result.FilePath);
            Assert.Equivalent(new string[] { "some", "col", "name" }, result.ColumnList);
        }

        [Fact]
        public void ParsesQueryCorrectWithOneColumn()
        {
            string cql = @"
            SELECT
                column
            FROM './myfile.csv';
";

            var result = Cql.Query(cql);
            Assert.NotNull(result);
            Assert.Equal("./myfile.csv", result.FilePath);
            Assert.Equivalent(new string[] { "column" }, result.ColumnList);
        }

        [Fact]
        public void ParsesQueryCorrectWithUpperCase()
        {
            string cql = @"SELECT ColA, ColB FROM './Sample.csv';
";

            var result = Cql.Query(cql);
            Assert.NotNull(result);
            Assert.Equal("./Sample.csv", result.FilePath);
            Assert.Equivalent(new string[] { "ColA", "ColB" }, result.ColumnList);
        }
    }
}
