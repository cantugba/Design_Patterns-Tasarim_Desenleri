
package davranissalobserver2;
//Concrete Observer
public class Uye implements IUye{
    private String E_Mail;
    private String sifre ;
    public Uye(String Mail,String sifrem){
        this.E_Mail=Mail;
        this.sifre=sifrem;
    }
    
    public absUrun  urun;

    public Uye(String E_Mail) {
        this.E_Mail = E_Mail;
    }

    @Override
    public String toString() {
        return "Uye{" + "E_Mail=" + E_Mail + ", sifre=" + sifre + ", urun=" + urun + '}';
    }
    
  
    
    @Override
    public void Update(absUrun urun) {
        System.out.println(urun.getUrunAdi()+ "adlı urun"+urun.getFiyat()+"fiyatı" +E_Mail+"adresine gonderildi");
        
    }

    public String getE_Mail() {
        return E_Mail;
    }

    public void setE_Mail(String E_Mail) {
        this.E_Mail = E_Mail;
    }

  

    public absUrun getUrun() {
        return urun;
    }

    public void setUrun(absUrun urun) {
        this.urun = urun;
    }
    
    
}
