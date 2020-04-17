package Adapter;

public class IsAdresi implements Adres {
    @Override
    public String alAcikAdres() {
        return "gelincik mah";
    }

    @Override
    public String alSemt() {
        return "Erfelek";
    }

    @Override
    public String alSehir() {
        return "Sinop";
    }

    @Override
    public String alUlke() {
        return "Turkiye";
    }
}
