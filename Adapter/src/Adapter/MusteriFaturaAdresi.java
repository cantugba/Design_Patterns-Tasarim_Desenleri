package Adapter;
//adaptee ile hedef sınıfı birbirine bağlayan adaptör sınıfı
public class MusteriFaturaAdresi implements Adres {
    private final Musteri musteri;

    public MusteriFaturaAdresi(final Musteri musteri){
        this.musteri=musteri;
    }
    @Override
    public String alAcikAdres() {
        return musteri.alAcikAdres();
    }

    @Override
    public String alSemt() {
        return musteri.alSemt();
    }

    @Override
    public String alSehir() {
        return musteri.alSehir();
    }

    @Override
    public String alUlke() {
        return musteri.alUlke();
    }

    public String alNumara(){
        return  musteri.alNumara();
    }
}
