package pl.krzychol99.model;

/**
 * Created by krzychol99 on 2017-01-15.
 */
public class Rectangle extends Shape{

    private double sideA;
    private double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public String toString(){
        return "Prostokąt o bokach " + sideA + " i " + sideB;
    }
}
