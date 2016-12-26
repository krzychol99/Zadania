/**
 * Created by krzychol99 on 2016-12-26.
 */
public class Square {
    double sideA;

    Square(double sideA){
        this.sideA = sideA;
    }
    double squareArea(){
        return Math.pow(sideA, 2);
    }
}
