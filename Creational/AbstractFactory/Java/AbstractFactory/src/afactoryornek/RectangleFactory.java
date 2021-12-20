
package afactoryornek;
/*
    Rectangle için fabrika sınıfı
 */
public class RectangleFactory implements ShapeAbstractFactory {

    @Override
    public Shape createShape() { return new Rectangle();    }
    
}
