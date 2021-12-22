package PhoneFactory;

public abstract class Phone {
    Camera camera;
    Display display;
    Processor processor;
    Security security;

    public abstract String getDescription();

    public String toString() {
        return "Camera: " + camera.toString() + "\n"
                + "Display: " + display.toString() + "\n"
                + "Processor: " + processor.toString() + "\n"
                + "Security: " + security.toString();
    }
}

class Iphone extends Phone {
    Iphone(PhoneDetailsFactory detailsFactory) {
        camera = detailsFactory.createCamera();
        display = detailsFactory.createDisplay();
        processor = detailsFactory.createProcessor();
        security = detailsFactory.createSecurity();
    }

    @Override
    public String getDescription() {
        return "This is THE iPhoneXs\n" + super.toString();
    }
}

class Samsung extends Phone {
    Samsung(PhoneDetailsFactory detailsFactory) {
        camera = detailsFactory.createCamera();
        display = detailsFactory.createDisplay();
        processor = detailsFactory.createProcessor();
        security = detailsFactory.createSecurity();
    }

    @Override
    public String getDescription() {
        return "Samsung Galaxy S10\n" + super.toString();
    }
}