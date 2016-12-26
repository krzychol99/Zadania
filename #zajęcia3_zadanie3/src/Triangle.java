/**
 * Created by krzychol99 on 2016-12-26.
 */
public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    double trianglePerimeter(){
        return sideA + sideB + sideC;
    }
}
