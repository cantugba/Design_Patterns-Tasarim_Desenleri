package BridgeTasarımDeseni;

public class Dikdortgen extends Sekil {

    public Dikdortgen(final CizimKalibi cizimKalibi){
        super(cizimKalibi,"Dikdörtgen");
    }

    public void ciz(){
        super.ciz();

        cizimKalibi.cizgiCiz();
        cizimKalibi.cizgiCiz();
        cizimKalibi.cizgiCiz();
        cizimKalibi.cizgiCiz();

    }
}
