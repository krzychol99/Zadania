/**
 * Created by krzychol99 on 2017-01-08.
 */
public class Interval {
    public static void main(String[] args) {

        double maxNum = 3.1;
        double intervalNum = 0.1;

        System.out.println("While loop: ");
        while(intervalNum < maxNum){
            System.out.printf("%.1f ", intervalNum);
            intervalNum += 0.1;
        }
        intervalNum = 0.1;
        System.out.println("\nDo while loop: ");
        do{
            intervalNum += 0.1;
            System.out.printf("%.1f ", intervalNum);
        } while(intervalNum < maxNum);
    }
}
