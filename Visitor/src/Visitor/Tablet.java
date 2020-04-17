
package Visitor;


public abstract class Tablet {
   private String Model;
   private String Brand;

    public Tablet(String Model, String Brand) {
        this.Model = Model;
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
   
    public abstract void Accept(IVisitor visitor);
   
   
}
