package PhoneFactory;

public interface Camera {
    String toString();
}

class IphoneCamera implements Camera {
    @Override
    public String toString() {
        return "12MP";
    }
}

class SamsungCamera implements Camera {
    @Override
    public String toString() {
        return "16MP+12MP+12MP";
    }
}