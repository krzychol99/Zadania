package pl.krzychol99.app;

import com.sun.org.apache.regexp.internal.RE;
import pl.krzychol99.calc.ShapeCalculator;
import pl.krzychol99.model.Circle;
import pl.krzychol99.model.Rectangle;
import pl.krzychol99.model.Shape;
import pl.krzychol99.model.Square;

/**
 * Created by krzychol99 on 2017-01-15.
 */
public class ShapeTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(20,30);
        shapes[2] = new Square(40);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        for (Shape shape : shapes) {
            System.out.println(shape);

            double area = 0;
            double perimeter = 0;

            if(shape instanceof Circle){
                area = shapeCalculator.calculateArea((Circle)shape);
                perimeter = shapeCalculator.calculatePerimeter((Circle)shape);
            } else if(shape instanceof Rectangle){
                area = shapeCalculator.calculateArea((Rectangle)shape);
                perimeter = shapeCalculator.calculatePerimeter((Rectangle)shape);
            } else if (shape instanceof Square){
                area = shapeCalculator.calculateArea((Square)shape);
                perimeter = shapeCalculator.calculatePerimeter((Square)shape);
            }
            System.out.println("Pole: " + area);
            System.out.println("Obwód " + perimeter);

        }

    }
}
