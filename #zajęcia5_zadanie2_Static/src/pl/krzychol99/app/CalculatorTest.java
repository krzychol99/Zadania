package pl.krzychol99.app;

import pl.krzychol99.model.Circle;
import pl.krzychol99.model.Rectangle;
import pl.krzychol99.logic.ShapeCalculator;
/**
 * Created by krzychol99 on 2017-01-12.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        Circle circle = new Circle(10);

        System.out.println("Pole prostokąta o bokach " + rectangle.getSideA()
                            + ", " + rectangle.getSideB()
                            + " wynosi " + ShapeCalculator.rectangleArea(rectangle));
        System.out.println("Obwód prostokąta o bokach " + rectangle.getSideA()
                            + ", " + rectangle.getSideB()
                            + " wynosi " + ShapeCalculator.rectanglePerimeter(rectangle));
        System.out.println("Pole koła o promieniu " + circle.getRadiusR()
                            + " wynosi " + ShapeCalculator.circleArea(circle));
        System.out.println("Obwód koła o promieniu " + circle.getRadiusR()
                + " wynosi " + ShapeCalculator.circlePerimeter(circle));
    }
}
