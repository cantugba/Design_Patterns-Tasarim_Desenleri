
package afactoryornek;

public class Rectangle implements Shape {
    private double width;
    private double height;

    @Override
    public double getArea() { return height * width;    }

    @Override
    public double getSize(){ return 2 *(width + height); }
    
    public void setWidth(double width){ this.width =width;    }
    
    public void setHeight(double height) { this.height = height;}
    
}
