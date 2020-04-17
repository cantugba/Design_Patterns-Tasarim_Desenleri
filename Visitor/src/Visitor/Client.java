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
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       IPAD ipad =new IPAD("İPAD MİNİ","APPLE");
       Galaxy g = new Galaxy("galaxy ","samsung");
       
       ipad.Accept(new WifiVisitor());
       g.Accept(new ThreeGVisitor()); 
       ipad.Accept(new ThreeGVisitor());
        
    }
    
}
