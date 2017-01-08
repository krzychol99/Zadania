package pl.krzychol99.app;

import pl.krzychol99.model.Points;

import java.util.Scanner;

/**
 * Created by krzychol99 on 2017-01-08.
 */
public class PointsControler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Points points = new Points();
        System.out.println("Please, enter point X: ");
        points.setPointX(input.nextDouble());
        input.nextLine();

        System.out.println("Please, enter point Y: ");
        points.setPointY(input.nextDouble());

        input.close();

        if(points.getPointX() > 0 && points.getPointY() > 0 ) {
            System.out.println("Point X and Y (" + points.getPointX() + ", " + points.getPointY() + ") are in I quadrant");
            }
        else if (points.getPointX() > 0 && points.getPointY() < 0){
            System.out.println("Point X and Y (" + points.getPointX()+", " + points.getPointY() + ") are in II quadrant");
            }
        else if(points.getPointX() < 0 && points.getPointY() < 0){
            System.out.println("Point X and Y (" + points.getPointX()+", " + points.getPointY() + ") are in III quadrant");
            }
        else if (points.getPointX() < 0 && points.getPointY() > 0){
            System.out.println("Point X and Y (" + points.getPointX()+", " + points.getPointY() + ") are in IV quadrant");
        }
    }
}
