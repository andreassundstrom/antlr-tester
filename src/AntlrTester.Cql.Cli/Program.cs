
using AntlrTester.Cql;

Console.WriteLine("Ange en Cql (testa från ./Sample.csv): ");
string? queryString = "";
while (true)
{
    Console.Write(" > ");
    queryString = Console.ReadLine();
    ArgumentNullException.ThrowIfNull(queryString);
    if (queryString == "exit")
    {
        return;
    }

    var query = Cql.Query(queryString);
    Cql.Print(query);
}
