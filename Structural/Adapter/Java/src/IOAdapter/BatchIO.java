package IOAdapter;

// Adaptee
public class BatchIO {

    public void kopyala(String kaynak, String hedef) {
        System.out.println(String.format("%s ==> %s BatchIO Kopyalandı.", kaynak,hedef));
    }

    public void dosyaOlustur(String dosyaYolu) {
        System.out.println(String.format("%s BatchIO DosyaOlusturuldu", dosyaYolu));
    }

    public void klasorOlustur(String dosyaYolu) {
        System.out.println(String.format("%s BatchIO KlasorOlusturuldu", dosyaYolu));
    }
}
