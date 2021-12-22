package TableFactory;

// ICreator
public abstract class TableFactory {

    public abstract Table createTable(String type);

    public Table orderTable(String type) {
        Table table = createTable(type);
        if (table == null) {
            System.out.println("Sorry, we are not able to create this kind of table\n");
            return null;
        }
        System.out.println("Making " + table.getName());
        table.attachLegs();
        table.attachTableTop();
        System.out.println("Created " + table.getName() + "\n");
        return table;
    }
}