package pl.krzychol99.model;

/**
 * Created by krzychol99 on 2017-01-12.
 */
public class Rectangle {
    private double sideA;
    private double SideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return SideB;
    }

    public void setSideB(double sideB) {
        SideB = sideB;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        SideB = sideB;
    }
}
