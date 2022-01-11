package BridgeTasarımDeseni;

public class Sekil {
    protected CizimKalibi cizimKalibi;
    private final String isim;

    public Sekil(CizimKalibi cizimKalibi,final String isim){
        this.isim=isim;
        this.cizimKalibi=cizimKalibi;
    }

    public void ciz(){
        System.out.println(isim+ " Çiziliyor..");
    }
}
