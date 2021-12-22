import Foundation

public class FactoryUtil
{
    class func GetFactory(db_name:String) -> DBFactory?
    {
        switch db_name {
        case "SQL":
            return SQLFactory()
        case "ORACLE":
            return OracleFactory()

        default:
            return nil;
        }

    }
}

// ABSTRACT FACTORY
protocol DBFactory
{
    func CreateConnection() -> Connection
    func CreateCommand() -> Command
}

// CONCRETE FACTORYs
class SQLFactory: DBFactory
{
    func CreateConnection() -> Connection
    {
        return SQLConnection()
    }

    func CreateCommand() -> Command
    {
        return SQLCommand()
    }
}

class OracleFactory: DBFactory
{
    func CreateConnection() -> Connection
    {
        return OracleConnection()
    }

    func CreateCommand() -> Command
    {
        return OracleCommand()
    }
}

// ABSTRACT PRODUCTs
protocol Connection
{
    func Connect()
    var ConnectionString:String
    {
        get
        set
    }
}

protocol Command
{
    func Execute()
    var Query:String
    {
        get
        set
    }
}

// CONCRETE PRODUCTs
class SQLConnection: Connection
{
    func Connect()
    {
        print("SQL'e bağlandı")
    }

    private var connectionString:String=""

    var ConnectionString:String
    {
        get
        {
            return connectionString
        }
        set(value)
        {
            connectionString = value
        }
    }
}

class OracleConnection: Connection
{
    func Connect()
    {
        print("Oracle'a bağlandı")
    }

    private var connectionString:String=""

    var ConnectionString:String
    {
        get
        {
            return connectionString
        }
        set(value)
        {
            connectionString = value
        }
    }
}

class SQLCommand: Command
{
    func Execute()
    {
        print("T_SQL çalıştı")
    }

    private var query:String=""

    var Query:String
    {
        get
        {
            return query
        }
        set(value)
        {
            query = value
        }
    }
}

class OracleCommand: Command
{
    func Execute()
    {
        print("PL/SQL çalıştı")
    }

    private var query:String=""

    var Query:String
    {
        get
        {
            return query
        }
        set(value)
        {
            query = value
        }
    }
}

//////// TEST ////////
var db:DBFactory = FactoryUtil.GetFactory(db_name: "SQL")!

var cnn:Connection = db.CreateConnection()
cnn.Connect()

var cmd:Command = db.CreateCommand()
cmd.Query = "Select * from Tablo"
cmd.Execute()

db = FactoryUtil.GetFactory(db_name: "ORACLE")!
cnn = db.CreateConnection()
cnn.Connect()

cmd = db.CreateCommand()
cmd.Query = "Select * from Tablo"
cmd.Execute()



