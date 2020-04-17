package Adapter;
//Sisteme entegre edilecek adaptee sınıfı
public class Musteri {
    private final String numara;
    private final String aciklama;
    private final String sehir;
    private final String semt;
    private final String acikAdres;
    private final String ulke;

    public Musteri(final String ulke,final String numara,final String aciklama, final String sehir,final String semt,final String acikAdres){
        this.acikAdres=acikAdres;
        this.semt=semt;
        this.aciklama=aciklama;
        this.sehir=sehir;
        this.numara=numara;
        this.ulke=ulke;
    }

    public String alAcikAdres(){ return acikAdres;}
    public String alSemt(){ return semt;}
    public String alSehir(){ return sehir;}
    public String alAciklama() { return aciklama; }
    public String alNumara() { return numara;}
    public String alUlke(){ return ulke;}
}
