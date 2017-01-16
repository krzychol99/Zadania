package pl.krzychol99.model;

/**
 * Created by krzychol99 on 2017-01-15.
 */
public class Square extends Shape {

    private double sideA;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public Square(double sideA) {
        this.sideA = sideA;
    }
    @Override
    public String toString(){
        return "Kwadrat o boku " + sideA;
    }
}
