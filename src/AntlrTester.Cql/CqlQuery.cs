namespace AntlrTester.Cql
{
    public class CqlQuery
    {
        public string FilePath { get; set; }
        public string[] ColumnList { get; set; }

        public CqlQuery(string filePath, string[] columnList)
        {
            FilePath = filePath;
            ColumnList = columnList;
        }
    }
}
