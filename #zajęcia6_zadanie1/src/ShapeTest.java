/**
 * Created by krzychol99 on 2017-01-15.
 */
public class ShapeTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(20,30);
        shapes[2] = new Square(40);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Pole " + shape.calculateArea());
            System.out.println("Obwód " + shape.calculatePerimeter());
        }

    }
}
