package PhoneFactory;

public interface Security {
    String toString();
}

class IphoneSecurity implements Security {
    @Override
    public String toString() {
        return "FaceID";
    }
}

class SamsungSecurity implements Security {
    @Override
    public String toString() {
        return "FingerPrint";
    }
}
