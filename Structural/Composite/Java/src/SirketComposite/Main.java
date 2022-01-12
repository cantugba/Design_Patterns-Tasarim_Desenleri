package SirketComposite;

public class Main {
    public static void main(String[] args) {
        Kadro arge = new Kadro("Feanor", BOLUM.ARGE);

        Kadro analist = new Kadro("Galadriel", BOLUM.ANALIST);
        analist.ekle(new Yazilim("Luthien", BOLUM.TEST));
        analist.ekle(new Yazilim("Ecbert", BOLUM.SENIOR));
        analist.ekle(new Yazilim("Frodo", BOLUM.JUNIOR));

        arge.ekle(analist);
        arge.yazdir(4);


    }
}
