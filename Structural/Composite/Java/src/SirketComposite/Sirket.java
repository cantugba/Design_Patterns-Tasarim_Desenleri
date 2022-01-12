package SirketComposite;

import java.util.*;

enum BOLUM {
    ARGE,
    ANALIST,
    TEST,
    SENIOR,
    JUNIOR
}
public abstract class Sirket {
    protected String isim;
    protected  BOLUM departman;

    public Sirket(String isim, BOLUM departman) {
        this.isim = isim;
        this.departman = departman;
    }

    public abstract void ekle(Sirket ys);
    public abstract void sil(Sirket ys);
    public abstract void yazdir(int satirbasi);
}

class Yazilim extends Sirket {

    public Yazilim(String isim, BOLUM departman) {
        super(isim, departman);
    }

    @Override
    public void ekle(Sirket ys) {}

    @Override
    public void sil(Sirket ys) {}

    @Override
    public void yazdir(int satirbasi) {
        System.out.println("-" + satirbasi + "> " + isim + " - " + departman);
    }
}

class Kadro extends Sirket {

    private List<Sirket> list = new ArrayList<>();

    public Kadro(String isim, BOLUM departman) {
        super(isim, departman);
    }

    @Override
    public void ekle(Sirket ys) {
        list.add(ys);
    }

    @Override
    public void sil(Sirket ys) {
        list.remove(ys);
    }

    @Override
    public void yazdir(int satirbasi) {
        System.out.println("-" + satirbasi + "> " + isim + " - " + departman);

        for (Sirket u :list) {
            u.yazdir(satirbasi + 2);
        }
    }
}
