package TableFactory;

public interface TableTools {
    String getTool();
}

class KitchenTableTool implements TableTools {
    @Override
    public String getTool() {
        return "These are kitchen table tools";
    }
}

class OfficeTableTool implements TableTools {
    @Override
    public String getTool() {
        return "These are office table tools";
    }
}