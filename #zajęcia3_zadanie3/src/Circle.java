/**
 * Created by krzychol99 on 2016-12-26.
 */
public class Circle {
    double radiusR;

    Circle(double radiusR){
        this.radiusR = radiusR;
    }
    double circleArea(){
        return Math.PI*(Math.pow(radiusR,radiusR));
    }
}
