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
public class Isci implements Personel {

    public void kabulEt(PersonelVisitor pv) {
       pv.ziyaretEt(this);
    }
    
}
