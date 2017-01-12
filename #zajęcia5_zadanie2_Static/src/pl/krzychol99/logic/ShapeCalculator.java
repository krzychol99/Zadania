package pl.krzychol99.logic;

import pl.krzychol99.model.Circle;
import pl.krzychol99.model.Rectangle;

/**
 * Created by krzychol99 on 2017-01-12.
 */
public class ShapeCalculator {

    public static double rectangleArea (Rectangle rectangle){
        return rectangle.getSideA() * rectangle.getSideB();
    }
    public static double rectanglePerimeter(Rectangle rectangle){
        return 2 * rectangle.getSideA() + 2 * rectangle.getSideB();
    }
    public static double circleArea(Circle circle){
        return Math.PI * Math.pow(circle.getRadiusR(),2);
    }
    public static double circlePerimeter(Circle circle){
        return 2 * Math.PI * circle.getRadiusR();
    }
}
