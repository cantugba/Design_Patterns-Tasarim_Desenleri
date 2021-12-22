package LaptopFactory;

public
interface Processor {
    String toString();
}

class MacBookProcessor implements Processor {

    @Override
    public String toString() {
        return "Dual-Core i5";
    }
}

class DellXPSProcessor implements Processor {
    @Override
    public String toString() {
        return "Core i7";
    }
}