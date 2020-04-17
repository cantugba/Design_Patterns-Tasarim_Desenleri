package AdapterYapısal;

public class Adaptee {
    private final double fiyat;
    private final double adet;
    private final double iskonto;

    public Adaptee(final double fiyat,final double adet,final double iskonto){
        this.adet=adet;
        this.fiyat=fiyat;
        this.iskonto=iskonto;
    }

    public double getAdet() {
        return adet;
    }
    public double getFiyat(){
        return fiyat;
    }

    public double getIskonto() {
        return iskonto;
    }

    public double IskontaliTutarHesapla(double fiyat, double adet){
        System.out.println("İskonto Miktari Girilen sınıf: ");
        return fiyat*adet*(1-iskonto);

    }
}
