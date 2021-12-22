package TableFactory;

public interface Table {
    public String getTable();
}

class KitchenTable implements Table {
    @Override
    public String getTable() {
        return "There is a kitchen table";
    }
}

class OfficeTable implements Table {
    @Override
    public String getTable() {
        return  "There is an office table";
    }
}