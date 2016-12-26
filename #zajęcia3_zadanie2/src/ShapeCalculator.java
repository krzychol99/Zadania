/**
 * Created by krzychol99 on 2016-12-23.
 */
public class ShapeCalculator {

    double squareArea(Square square){
        return Math.pow(square.sideA,2);
    }
    double circleArea(Circle circle){
        return Math.PI*(Math.pow(circle.radiusR,circle.radiusR));
    }
    double trianglePerimeter(Triangle triangle){
        return triangle.sideA + triangle.sideB + triangle.sideC;
    }
    double rectPerimeter(Rectangle rectangle){
        return rectangle.sideA * 2 + rectangle.sideB * 2;
    }
}
