/**
 * Created by krzychol99 on 2016-12-26.
 */
public class CalcTest {
    public static void main(String[] args) {
        Square square = new Square(8);
        Rectangle rectangle = new Rectangle(12,8);
        Circle circle = new Circle(45);
        Triangle triangle = new Triangle(23, 12,45);

        System.out.println(square.squareArea());
        System.out.println(rectangle.rectPerimeter());
        System.out.println(circle.circleArea());
        System.out.println(triangle.trianglePerimeter());

    }
}
