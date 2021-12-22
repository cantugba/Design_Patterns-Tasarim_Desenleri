package TableFactory;

interface TableFactory {
    Table makeTable();
    TableTools makeTableTools();
}

class KitchenTableFactory implements TableFactory {
    @Override
    public Table makeTable() {
        return new KitchenTable();
    }

    @Override
    public TableTools makeTableTools() {
        return new KitchenTableTool();
    }
}

class OfficeTableFactory implements TableFactory {
    @Override
    public Table makeTable() {
        return new OfficeTable();
    }

    @Override
    public TableTools makeTableTools() {
        return new OfficeTableTool();
    }
}