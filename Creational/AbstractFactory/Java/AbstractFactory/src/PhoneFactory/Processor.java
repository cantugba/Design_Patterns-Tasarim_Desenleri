package PhoneFactory;

public interface Processor {
    String toString();
}

class IphoneProcessor implements Processor {
    @Override
    public String toString() {
        return "A12";
    }
}

class SamsungProcessor implements Processor {
    @Override
    public String toString() {
        return "Exynos 9820";
    }
}
