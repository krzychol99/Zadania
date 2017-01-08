/**
 * Created by krzychol99 on 2017-01-08.
 */
public class Interval {
    public static void main(String[] args) {

        double maxNum = 3;
        double intervalNum = 0.1;
        double i = -0.1;
        double j = -0.1;

        System.out.println("While loop: ");
        while(i < maxNum){
            i += intervalNum;
            System.out.println(i);
        }
        System.out.println("Do while loop: ");
        do{
            j += intervalNum;
            System.out.println(j);
        } while(j < maxNum);
    }
}
