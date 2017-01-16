/**
 * Created by krzychol99 on 2017-01-15.
 */
public class Circle extends Shape {

    private double radiusR;

    public double getRadiusR() {
        return radiusR;
    }

    public void setRadiusR(double radiusR) {
        this.radiusR = radiusR;
    }

    public Circle() {
    }

    public Circle(double radiusR) {
        this.radiusR = radiusR;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusR, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radiusR;

    }
    @Override
    public String toString(){
        return "Kolo o promieniu " + radiusR;
    }
}
