
package afactoryornek;
/*
    alt somut fabrika sınıfı
 */
public class CircleFactory implements ShapeAbstractFactory {

    @Override
    public Shape createShape() { return new Circle();    }
    
}
