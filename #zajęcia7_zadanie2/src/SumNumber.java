import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by krzychol99 on 2017-01-18.
 */
public class SumNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz zsumować");
        int numbersToSum = 0;

        try {
            numbersToSum = scanner.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Podana liczba musi być liczbą całkowitą");
        }

        double numbers[] = new double[numbersToSum];

        double sum = 0;

        for(int i = 0; i<numbers.length; i++){
            try {
                System.out.println("Podaj liczbę: ");
                numbers[i] = scanner.nextInt();
            } catch (InputMismatchException ex){
                System.out.println("Podano nieprawidłową wartość");
            }
            sum = sum + numbers[i];
        }
        System.out.println("Suma podanych liczb to: " + sum);
    }
}
