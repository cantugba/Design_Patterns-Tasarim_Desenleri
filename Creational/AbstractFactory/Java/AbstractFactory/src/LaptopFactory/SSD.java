package LaptopFactory;

public interface SSD {
    String toString();
}

class MacBookSSD implements SSD {
    @Override
    public String toString() {
        return "256Gb SSD";
    }
}

class DellXPSSSD implements SSD {
    @Override
    public String toString() {
        return "256Gb SSD";
    }
}