/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorornek;

/**
 *
 * @author asus
 */
public class CalismaPlaniVisitor implements PersonelVisitor{

    @Override
    public void ziyaretEt(Isci isci) {
        System.out.println("isci calısma planı hesapladı");
    }

    @Override
    public void ziyaretEt(Yonetici yonetici) {
        
        System.out.println("yonetici calısma planı hesapladı");
    }
    
}
