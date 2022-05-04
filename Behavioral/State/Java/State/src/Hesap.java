public class Hesap {
    private HesapDurumu hesapDurumu;

    public Hesap() {
        hesapDurumu = new NormalHesap();
    }

    public void faizOde() {
        hesapDurumu.faizOde();
    }

    public void paraCek() {
        hesapDurumu.paraCek();
    }

    public void hesapDurumuDegistir(final HesapDurumu hesapDurumu) {
        this.hesapDurumu = hesapDurumu;
    }
}

interface HesapDurumu {
    void paraCek();
    void faizOde();
}

class NormalHesap implements HesapDurumu {

    @Override
    public void paraCek() {
        System.out.println("Normal hesaptan para cekildi");
    }

    @Override
    public void faizOde() {
        System.out.println("Normal hesaptan faiz odendi");
    }
}

class AltinHesap implements HesapDurumu {
    @Override
    public void paraCek() {
        System.out.println("Altin hesaptan para cekildi");
    }

    @Override
    public void faizOde() {
        System.out.println("Altin hesaptan faiz odendi");
    }
}

class Musteri {
    public static void main(String[] args) {
        // Yaratılan hesap varsayılan olarak 'normal' durumda.
        final Hesap hesap = new Hesap();
        hesap.faizOde();
        hesap.paraCek();

        // Çalışma zamanında hesap durum değiştiriliyor.
        // Müşteri altın hesaba geçiriliyor.
        hesap.hesapDurumuDegistir( new AltinHesap() );

        System.out.println( "Müşteri altın hesaba geçiriliyor." );

        // Durum değiştiği için davranış da değişecek.
        hesap.faizOde();
        hesap.paraCek();
    }
}

