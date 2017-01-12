import java.util.Random;

/**
 * Created by krzychol99 on 2017-01-12.
 */
public class OneHundredArray {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[100];
        int counter = 0;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1000);
        }
        for(int number: numbers){
            System.out.println(number);
        }
        for (int number: numbers){
            if(number < 50) {
                counter++;
            }
        }
        System.out.println("Quantity of numbers smaller than 50: " + counter);

        counter = 0;
        for (int number: numbers){
            if(number > 50){
                counter++;
            }
        }
        System.out.println("Quantity of numbers bigger than 50: " + counter);

        counter = 0;
        for (int number: numbers){
            if(number%2 == 0){
                counter++;
            }
        }
        System.out.println("Quantity of even numbers : " + counter);

        counter = 0;
        for (int number: numbers){
            if(number%2 != 0){
                counter++;
            }
        }
        System.out.println("Quantity of odd numbers : " + counter);
    }
}
