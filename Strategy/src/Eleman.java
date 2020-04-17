/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Eleman {
    public IzinHesapla izinH;
    public MaasHesap maasH;

    public Eleman(IzinHesapla izinH, MaasHesap maasH) {
        this.izinH = izinH;
        this.maasH = maasH;
    }
    
    public int izinHesapla(){
        return izinH.izinHesapla();
    }
    
     public int maasHesapla(){
        return maasH.maasHesapla();
    }
    
}
