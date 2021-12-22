package LaptopFactory;

public
abstract class Laptop {
    Display display;
    GraphicCard graphicCard;
    Processor processor;
    SSD ssd;

    abstract String getDescription();

    @Override
    public String toString() {
        return "Display: " + display.toString() + "\n"
                + "GraphicCard: " + graphicCard.toString() + "\n"
                + "Processor: " + processor.toString() + "\n"
                + "SSD: " + ssd.toString();
    }
}

class MacBook extends Laptop {

    MacBook(LaptopDetailsFactory detailsFactory) {
        display = detailsFactory.createDisplay();
        graphicCard = detailsFactory.createGraphicCard();
        processor = detailsFactory.createProcessor();
        ssd = detailsFactory.createSSD();
    }

    @Override
    public String getDescription() {
        return "This is a MacBook Pro 13\"\n" + super.toString();
    }
}

class DellXPS extends Laptop {

    DellXPS(LaptopDetailsFactory detailsFactory) {
        display = detailsFactory.createDisplay();
        graphicCard = detailsFactory.createGraphicCard();
        processor = detailsFactory.createProcessor();
        ssd = detailsFactory.createSSD();
    }

    @Override
    public String getDescription() {
        return "This is a Dell XPS 9370\n" + super.toString();
    }
}