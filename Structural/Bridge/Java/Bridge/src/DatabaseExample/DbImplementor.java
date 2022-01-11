package DatabaseExample;

//Implementor
public interface DbImplementor {
    void execute(String sql);
    void openCon(String sqlCon);
}

//ConcreteImplementor
class SqlServerImplementor implements DbImplementor {

    @Override
    public void execute(String sql) {
        System.out.println(sql + "SqlServer işletildi.");
    }

    @Override
    public void openCon(String sqlCon) {
        System.out.println(sqlCon + "SqlServer Con. açıldı.");
    }
}

//ConcreteImplementor
class OracleImplementor implements DbImplementor {

    @Override
    public void execute(String sql) {
        System.out.println(sql + "Oracle işletildi.");
    }

    @Override
    public void openCon(String sqlCon) {
        System.out.println(sqlCon + "Oracle Con. açıldı.");
    }
}