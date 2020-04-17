/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;



/**
 *
 * @author asus
 */
public class WifiVisitor implements IVisitor{
    
    @Override
    public void Visit(Tablet tablet) {
        if(tablet instanceof IPAD){
            System.out.println("IPAD WİFİSİ AÇIK");
        
    }
        else if(tablet instanceof  Galaxy){
            System.out.println("galxy wifisi açık");
        }
        else System.out.println("obje tablet değil");
    }
    
}
