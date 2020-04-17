/*
  Somut Fabrika sınıflalrının turune gore shape nesneleri uretilmesini sağlar.
 */
package afactoryornek;

public class ShapeFactory {
    
    public static Shape getShape(ShapeAbstractFactory factory){
        return factory.createShape();
    }
    
}
