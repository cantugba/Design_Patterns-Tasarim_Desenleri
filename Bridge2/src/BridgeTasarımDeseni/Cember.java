package BridgeTasarımDeseni;

public class Cember extends Sekil {

    public Cember(CizimKalibi cizimKalibi) {
        super(cizimKalibi, "Çember");
    }

    public void ciz(){
        super.ciz();
        cizimKalibi.cemberCiz();
    }
}
