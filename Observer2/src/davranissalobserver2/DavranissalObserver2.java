/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissalobserver2;

/**
 *
 * @author asus
 */
public class DavranissalObserver2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
       absUrun kitap = new Urun("kitap",123.0);
       
       kitap.TakipList.add(new Uye("tubacan_1@hotmail.com"));
       kitap.TakipList.add(new Uye("tubacandwsd_1@hotmail.com"));
      
       kitap.setFiyat(13314.0);
       kitap.toString();
       kitap.setUrunAdi("aliadfspakf");
        System.out.println(""+kitap.getFiyat());
        
        
        
    }
    
}
