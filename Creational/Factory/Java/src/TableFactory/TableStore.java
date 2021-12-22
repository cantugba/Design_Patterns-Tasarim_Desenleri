package TableFactory;

//ConcreteCreator
class TableStore extends TableFactory {
    @Override
    public Table createTable(String type) {
        if (type.equals("office")) {
            return new TableOffice("Office TableFactory.TableFactory.Table");
        } else if (type.equals("kitchen")) {
            return new TableKitchen("Kitchen TableFactory.TableFactory.Table");
        } else return null;
    }
}