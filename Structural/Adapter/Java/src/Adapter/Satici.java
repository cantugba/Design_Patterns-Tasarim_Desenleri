package Adapter;

public class Satici {
    //client
    public static void main(String[] args) {
        //ornek bir adaptee yarat
        //adapteenin adaptorunu yarat
        //adaptee nın adaptor sayesinde target sınıfı olmasını sağla

        final Musteri musteri=new Musteri("105", "açıklama", "Atatürk Mah. Gazi Sok. No:15", "Sancaktepe",
                "İstanbul", "Türkiye");

        final MusteriFaturaAdresi adaptör= new MusteriFaturaAdresi(musteri);

        final Adres adres = adaptör;
        System.out.println( "Adres:" + adres.alAcikAdres() );
        System.out.println( "Semt:" + adres.alSemt() );
        System.out.println( "Şehir:" + adres.alSehir() );
        System.out.println( "Ülke:" + adres.alUlke() );

    }
}
