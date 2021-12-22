class FactoryUtil
{
    companion object {
        @Throws(Exception::class)
        fun GetFactory(db_name: String):DBFactory
        {
            if (db_name == "SQL") {
                return SQLFactory()
            }
            if (db_name == "ORACLE") {
                return OracleFactory()
            }
            throw Exception("hata!")
        }
    }
}

// Abstract Factory

abstract class DBFactory
{
    abstract fun CreateConnection(): Connection
    abstract fun CreateCommand(): Command
}

// Concrete Factorys
class SQLFactory: DBFactory()
{
    override fun CreateCommand(): Command {
        return SQLCommand()
    }

    override fun CreateConnection(): Connection {
        return SQLConnection()
    }
}

class OracleFactory: DBFactory()
{
    override fun CreateCommand(): Command {
        return OracleCommand()
    }

    override fun CreateConnection(): Connection {
        return OracleConnection()
    }
}

// Abstract Products
abstract class Connection {
    protected var connectionString: String
    abstract fun Connect()
}

abstract class Command {
    protected var Query: String
    abstract fun Execute()
}


// Concrete Products
class SQLConnection: Connection()
{
    override var connectionString: String
            get() {
                return connectionString
            }
            set(cstr) {
                connectionString = cstr
            }
    override fun Connect() {
        println("SQL'e bağlandı")
    }
}

class OracleConnection: Connection()
{
    override var connectionString: String
        get() {
            return connectionString
        }
        set(cstr) {
            connectionString = cstr
        }
    override fun Connect() {
        println("Oracle'a bağlandı")
    }
}

class SQLCommand: Command()
{
    override var Query: String = ""
        get() {
            return this.Query
        }
        set(q) {
            field = q
        }
    override fun Execute() {
        println("T_SQL calisti")
    }
}

class OracleCommand: Command()
{
    override var Query: String = ""
        get() {
            return this.Query
        }
        set(q) {
            field = q
        }
    override fun Execute() {
        println("PL/SQL calisti")
    }
}


//  TEST
fun main(args: Array<String>)
{
    try {
        var db = FactoryUtil.GetFactory("SQL")
        var cnn = db.CreateConnection()
        cnn.Connect()
        var cmd = db.CreateCommand()
        cmd.Query = "Select * from Tablo"
        cmd.Execute()

        db = FactoryUtil.GetFactory("Oracle")
        cnn = db.CreateConnection()
        cnn.Connect()
        cmd = db.CreateCommand()
        cmd.Query = "Select * from Tablo"
        cmd.Execute()

    } catch (e: Exception) {
        println(e.message)
    }
}