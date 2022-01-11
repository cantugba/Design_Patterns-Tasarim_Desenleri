package DatabaseExample;

//Abstraction
public abstract class DbAbstraction {
    protected DbImplementor implementor;

    public DbAbstraction(DbImplementor impl) {
        this.implementor = impl;
    }

    public DbImplementor getImplementor() {
        return implementor;
    }

    public void setImplementor(DbImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void exec(String sql);
    public abstract void conOpen(String conStr);
}

//RefinedAbstraction
class DbRefinedAbstraction extends DbAbstraction {

    public DbRefinedAbstraction(DbImplementor implementor) {
        super(implementor);
    }

    @Override
    public void exec(String sql) {
        implementor.execute(sql);
    }

    @Override
    public void conOpen(String conStr) {
        implementor.openCon(conStr);
    }
}