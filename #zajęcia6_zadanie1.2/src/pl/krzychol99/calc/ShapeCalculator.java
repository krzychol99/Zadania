package pl.krzychol99.calc;

import pl.krzychol99.model.Circle;
import pl.krzychol99.model.Rectangle;
import pl.krzychol99.model.Square;

/**
 * Created by MałaMi on 2017-01-16.
 */
public class ShapeCalculator {


    public double calculateArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadiusR(), 2);
    }
    public double calculatePerimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadiusR();
    }
    public double calculateArea(Rectangle rectangle){
        return rectangle.getSideA() * rectangle.getSideB();
    }
    public double calculatePerimeter(Rectangle rectangle){
        return (2 * rectangle.getSideA()) + (2 * rectangle.getSideB());
    }
    public double calculateArea(Square square){
        return Math.pow(square.getSideA(),2);
    }
    public double calculatePerimeter(Square square){
        return 4 * square.getSideA();
    }

}
