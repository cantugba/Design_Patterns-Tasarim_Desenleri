package LaptopFactory;

public interface LaptopDetailsFactory {
    Display createDisplay();
    GraphicCard createGraphicCard();
    Processor createProcessor();
    SSD createSSD();
}

class MacBookDetailsFactory implements LaptopDetailsFactory {
    @Override
    public Display createDisplay() {
        return new MacBookDisplay();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new MacBookGraphicCard();
    }

    @Override
    public Processor createProcessor() {
        return new MacBookProcessor();
    }

    @Override
    public SSD createSSD() {
        return new MacBookSSD();
    }
}

class DellXPSDetailsFactory implements LaptopDetailsFactory {
    @Override
    public Display createDisplay() {
        return new DellXPSDisplay();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new DellXPSGraphicCard();
    }

    @Override
    public Processor createProcessor() {
        return new DellXPSProcessor();
    }

    @Override
    public SSD createSSD() {
        return new DellXPSSSD();
    }
}