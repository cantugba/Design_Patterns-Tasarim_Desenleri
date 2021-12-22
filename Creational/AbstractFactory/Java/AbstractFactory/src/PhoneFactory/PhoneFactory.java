package PhoneFactory;

public interface PhoneFactory {
    Phone createPhone();
}

class IphoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        PhoneDetailsFactory detailsFactory = new IphoneDetailsFactory();

        return new Iphone(detailsFactory);
    }
}

class SamsungFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        PhoneDetailsFactory detailsFactory = new SamsungDetailsFactory();

        return new Samsung(detailsFactory);
    }
}