/**
 * Created by krzychol99 on 2017-01-08.
 */
public class EvenNumbers {
    public static void main(String[] args) {
        int i = 0;
        int maxNumber = 100;
        int sumEven = 0;

        while(i<=100){
            if(i%2 == 0)
                System.out.println(i);
                sumEven = sumEven + i;
                i++;
        }
        System.out.println("Sum of even numbers equal: " + sumEven);
    }
}
