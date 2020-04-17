
package afactoryornek;
//test sınıfı

public class AFactoryOrnek {

    public static void main(String[] args) {
       Shape rectangle = ShapeFactory.getShape(new RectangleFactory());
       ((Rectangle) rectangle).setHeight(5);
       ((Rectangle) rectangle).setWidth(5);
       
       
       Shape circle = ShapeFactory.getShape(new CircleFactory());
       ((Circle) circle).setRadius(4);
       
        System.out.println("rectangle area: "+rectangle.getArea() +"rectangle size"+rectangle.getSize());
        System.out.println("Circle area : " +circle.getArea()+"Circle size: "+circle.getSize());
    }
    
}
