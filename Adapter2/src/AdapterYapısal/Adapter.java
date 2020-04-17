package AdapterYapısal;

public class Adapter implements ITutarHesapla {
    private final Adaptee adaptee;

    public Adapter(final Adaptee adaptee){
        this.adaptee= adaptee;


    }

    @Override
    public double hesapla(double fiyat, double adet) {


        return adaptee.IskontaliTutarHesapla(fiyat,adet);
    }
}
