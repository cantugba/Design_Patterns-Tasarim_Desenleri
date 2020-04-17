
package afactoryornek;

public class Circle implements Shape{
    private double radius;
    @Override
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public double getSize() { return 2 * Math.PI  *radius;    }
    
    public void setRadius(double radius) { this.radius = radius;}    
}
