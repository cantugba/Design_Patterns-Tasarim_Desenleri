package BridgeTasarımDeseni;

public class Ucgen extends Sekil {

    public Ucgen(final CizimKalibi cizimKalibi){
        super(cizimKalibi,"Üçgen");
    }

    @Override
    public void ciz() {
        super.ciz();
        cizimKalibi.cizgiCiz();
        cizimKalibi.cizgiCiz();
        cizimKalibi.cizgiCiz();
    }
}
