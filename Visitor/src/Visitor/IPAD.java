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
public class IPAD extends Tablet{
    
    public final static int a=300;

    public IPAD(String Model, String Brand) {
        super(Model, Brand);
       
    }

    @Override
    public void Accept(IVisitor visitor) {
        visitor.Visit(this);
    }
    
}
