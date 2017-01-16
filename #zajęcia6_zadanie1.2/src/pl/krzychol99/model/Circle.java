package pl.krzychol99.model;

/**
 * Created by krzychol99 on 2017-01-15.
 */
public class Circle extends Shape{

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
    public String toString(){
        return "Kolo o promieniu " + radiusR;
    }
}
