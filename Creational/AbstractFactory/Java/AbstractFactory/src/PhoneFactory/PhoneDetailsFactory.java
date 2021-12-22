package PhoneFactory;

public interface PhoneDetailsFactory {
    Camera createCamera();
    Display createDisplay();
    Processor createProcessor();
    Security createSecurity();
}

class IphoneDetailsFactory implements PhoneDetailsFactory {
    @Override
    public Camera createCamera() {
        return new IphoneCamera();
    }

    @Override
    public Display createDisplay() {
        return new IphoneDisplay();
    }

    @Override
    public Processor createProcessor() {
        return new IphoneProcessor();
    }

    @Override
    public Security createSecurity() {
        return new IphoneSecurity();
    }
}

class SamsungDetailsFactory implements PhoneDetailsFactory {
    @Override
    public Camera createCamera() {
        return new SamsungCamera();
    }

    @Override
    public Display createDisplay() {
        return new SamsungDisplay();
    }

    @Override
    public Processor createProcessor() {
        return new SamsungProcessor();
    }

    @Override
    public Security createSecurity() {
        return new SamsungSecurity();
    }
}