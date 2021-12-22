package PhoneFactory;

public interface Display {
    String toString();
}

class IphoneDisplay implements Display {
    @Override
    public String toString() {
        return "5.8\" OLED";
    }
}

class SamsungDisplay implements Display {
    @Override
    public String toString() {
        return "6.1\" Dynamic AMOLED";
    }
}