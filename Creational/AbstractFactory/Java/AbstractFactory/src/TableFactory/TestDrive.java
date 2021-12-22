package TableFactory;

public class TestDrive {
    public static void main(String[] args) {
        Table table;
        TableTools tableTools;

        TableFactory kitchenTableFactory = new KitchenTableFactory();
        TableFactory officeTableFactory = new OfficeTableFactory();

        System.out.println("-I work as a cook. I need a kitchen table");
        System.out.println("-Got It! Give me a sec,- Calling the KitchenTableFactory. - Bring me the KitchenTable with KitchenTableTools");
        Thread.sleep(5000);

        table = kitchenTableFactory.makeTable();
        tableTools = kitchenTableFactory.makeTableTools();

        System.out.println(table.getTable() + "\n" + tableTools.getTool());
        System.out.println("-There they are!\n");
        Thread.sleep(5000);

        System.out.println("-I am an office manager. I need an office table");
        System.out.println("-Got It! Give me a sec,- Calling the OfficeTableFactory. - Bring me the OfficeTable with OfficeTableTools");
        Thread.sleep(5000);

        table = officeTableFactory.makeTable();
        tableTools = officeTableFactory.makeTableTools();

        System.out.println(table.getTable() + "\n" + tableTools.getTool());
        System.out.println("-There they are!");
    }
}
