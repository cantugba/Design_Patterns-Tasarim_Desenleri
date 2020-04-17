
package davranissalobserver2;

//CONCRETE SUBJECT
public class Urun extends absUrun{
        
    public Urun(String UrunAd, Double UrunFiyat) {
        super(UrunAd, UrunFiyat);
    }

    @Override
    void yaz() {
        System.out.println("hey");
    }
        
   
}
