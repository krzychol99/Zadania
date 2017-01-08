package pl.krzychol99.model;

/**
 * Created by krzychol99 on 2017-01-08.
 */
public class Points {
    private double pointX;
    private double pointY;

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }
    public Points(){}

    public Points(double pointX, double pointY){
        this.setPointX(pointX);
        this.setPointY(pointY);
    }

}
