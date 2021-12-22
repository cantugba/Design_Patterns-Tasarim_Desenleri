package LaptopFactory;

public interface GraphicCard {
    String toString();
}

class MacBookGraphicCard implements GraphicCard {
    @Override
    public String toString() {
        return "Intel Iris Plus Graphics 640";
    }
}

class DellXPSGraphicCard implements GraphicCard {
    @Override
    public String toString() {
        return "Intel UHD 620 GPU";
    }
}