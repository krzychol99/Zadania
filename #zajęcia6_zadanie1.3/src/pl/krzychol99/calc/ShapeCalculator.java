package pl.krzychol99.calc;

import pl.krzychol99.model.Circle;
import pl.krzychol99.model.Rectangle;
import pl.krzychol99.model.Square;
import pl.krzychol99.model.Shape;

/**
 * Created by MałaMi on 2017-01-16.
 */
public class ShapeCalculator {

    public static double calculateArea(Shape shape){
        double area = 0;

        if(shape instanceof Circle ){
            area = calculateArea((Shape) shape);
        }else if (shape instanceof Rectangle){
            area = calculateArea((Shape)shape);
        } else if(shape instanceof Square){
            area = calculateArea((Shape)shape);
        }
        return area;
    }

    public static double calculatePerimeter(Shape shape){
        double perimeter = 0;

        if(shape instanceof Circle ){
            perimeter = calculateArea((Shape) shape);
        }else if (shape instanceof Rectangle){
            perimeter = calculateArea((Shape)shape);
        } else if(shape instanceof Square){
            perimeter = calculateArea((Shape)shape);
        }
        return perimeter;
    }

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
