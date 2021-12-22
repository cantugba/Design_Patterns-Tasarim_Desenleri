package LaptopFactory;

public interface LaptopFactory {
    Laptop createComputer();
}

class MacBookFactory implements LaptopFactory {
    @Override
    public Laptop createComputer() {
        LaptopDetailsFactory detailsFactory = new MacBookDetailsFactory();

        return new MacBook(detailsFactory);
    }
}

class DellXPSFactory implements LaptopFactory {
    @Override
    public Laptop createComputer() {
        LaptopDetailsFactory detailsFactory = new DellXPSDetailsFactory();

        return new DellXPS(detailsFactory);
    }
}