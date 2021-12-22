package LaptopFactory;

public
interface Display {
    String toString();
}

class MacBookDisplay implements Display {

    @Override
    public String toString() {
        return "13\" 4K display";
    }
}

class DellXPSDisplay implements Display {
    @Override
    public String toString() {
        return "13\" FHD screen";
    }
}
