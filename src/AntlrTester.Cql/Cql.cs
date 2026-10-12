using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using SoftCircuits.CsvParser;
using System.Text;

namespace AntlrTester.Cql
{
    public class Cql : CqlBaseVisitor<CqlQuery?>
    {
        public static CqlQuery Query(string cql)
        {
            var inputStream = new AntlrInputStream(cql);
            var tokens = new CqlLexer(inputStream);
            var commonToken = new CommonTokenStream(tokens);
            var parser = new CqlParser(commonToken);
            var context = parser.cql();
            var cqlQuery = new Cql();
            var result = cqlQuery.VisitCql(context);

            ArgumentNullException.ThrowIfNull(result);

            return result;
        }

        public static void Print(CqlQuery query)
        {
            using CsvReader reader = new(query.FilePath, new CsvSettings { ColumnDelimiter = ';' });

            // Läsa header-raden
            reader.Read();
            int padding = 20;
            var dict = new Dictionary<string, int>();
            var sb = new StringBuilder();

            for (int i = 0; i < reader.Columns?.Count(); i++)
            {
                dict.Add(reader.Columns[i], i);
            }

            sb.Append("| ");
            var breaker = new StringBuilder("| ");
            foreach (var key in query.ColumnList)
            {
                if (key == "*")
                {
                    foreach (var csvCol in reader.Columns)
                    {
                        var padded = $"{csvCol}".PadRight(padding) + " | ";
                        sb.Append(padded);
                        breaker.Append("".PadRight(padding, '='));
                        breaker.Append(" | ");
                    }
                }
                else
                {
                    var padded = $"{key}".PadRight(padding) + " | ";
                    breaker.Append("".PadRight(padding, '~'));
                    sb.Append(padded);
                    breaker.Append(" | ");
                }
            }
            sb.AppendLine();
            sb.AppendLine(breaker.ToString());
            while (reader.Read())
            {
                sb.Append("| ");
                foreach (var column in query.ColumnList)
                {
                    if (column == "*")
                    {
                        foreach (var csvCol in reader.Columns)
                        {
                            var padded = $"{csvCol}".PadRight(padding) + " | ";
                            sb.Append(padded);
                        }
                    }
                    else
                    {
                        var padded = $"{reader.Columns[dict[column]]}".PadRight(padding) + " | ";
                        sb.Append(padded);
                    }
                }
                sb.AppendLine();
            }
            Console.WriteLine(sb);
        }

        public override CqlQuery? VisitCql([NotNull] global::CqlParser.CqlContext context)
        {
            if (context.from_clause() == null)
            {
                return null;
            }
            if (context.from_clause().file_name() == null)
            {
                return null;
            }
            if (context.select_clause() == null)
            {
                return null;
            }

            string filename = context.from_clause().file_name().GetText();
            var column_list = context.column_list().column_name().Select(p => p.GetText()).ToArray();

            var cqlQuery = new CqlQuery(filename, column_list);

            return cqlQuery;
        }

    }
}
