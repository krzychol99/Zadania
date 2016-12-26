/**
 * Created by krzychol99 on 2016-12-23.
 */
public class CalcTest {
    public static void main(String[] args) {
        Square sqr = new Square(10.5);
        Rectangle rec = new Rectangle(22,155);
        Circle circ = new Circle(58);
        Triangle triang = new Triangle(12, 5,4);

        ShapeCalculator shapeCalc = new ShapeCalculator();

        double sqrtArea = shapeCalc.squareArea(sqr);
        double circArea = shapeCalc.circleArea(circ);
        double triangArea = shapeCalc.trianglePerimeter(triang);
        double recArea = shapeCalc.rectPerimeter(rec);

        System.out.println(sqrtArea);
        System.out.println(circArea);
        System.out.println(triangArea);
        System.out.println(recArea);
        /**
         * Zadanie 3, zwrócenie
         */

    }
}
