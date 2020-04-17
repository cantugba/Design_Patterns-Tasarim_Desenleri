
package davranissalobserver2;

import java.util.ArrayList;
import java.util.List;

public abstract class absUrun {
    private String urunAdi;
    private Double _Fiyat;
     //Observer nesne Listesi
    public List<IUye> TakipList;
    
    public absUrun(String UrunAd,Double UrunFiyat){
        this.urunAdi= UrunAd;
        this.TakipList = new ArrayList<IUye>();
        this._Fiyat=UrunFiyat;
    }
    
    public Double getFiyat(){
    return _Fiyat;
    }
    
    public void setFiyat(double value){
        
        //fiyatı düşmüş ise üyelere haber ver
        if(this._Fiyat >value){
            NotifyUrun();
            this._Fiyat=value;
        }
    }
    
    public void NotifyUrun(){
        for(IUye uye : TakipList){
            uye.Update(this);
        }
    }
    
    public String UrunAdi(){
        return urunAdi;
    }

    @Override
    public String toString() {
        return "absUrun{" + "urunAdi=" + getUrunAdi() + ", _Fiyat=" + _Fiyat + ", TakipList=" + TakipList + '}';
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

   /*public Double getFiyat() {
        return _Fiyat;
    }*/

    public void setFiyat(Double _Fiyat) {
        this._Fiyat = _Fiyat;
    }

    public List<IUye> getTakipList() {
        return TakipList;
    }

    public void setTakipList(List<IUye> TakipList) {
        this.TakipList = TakipList;
    }
    
    abstract void yaz();
    
   
}
