/**
 * Created by krzychol99 on 2016-12-26.
 */
public class Rectangle {
    double sideA;
    double sideB;

    Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    double rectPerimeter() {
        return sideA * 2 + sideB * 2;
    }
}
