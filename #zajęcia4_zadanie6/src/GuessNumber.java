import java.util.Scanner;

/**
 * Created by krzychol99 on 2017-01-08.
 */
public class GuessNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean compareNumber = false;

        do {
            System.out.println("Enter the number between 100 and 200, wchich is divisible by 3");
            int userNumber = input.nextInt();
            if (userNumber < 100)
                System.out.println("Your number is to small! Please, try again.");
            else if (userNumber > 200)
                System.out.println("Your number is to big! Please, try again.");
            else if (userNumber % 3 != 0)
                System.out.println("Your number is not divisible by 3! Please, try again");
            else {
                System.out.println("Good! Your number is O.K.");
                compareNumber = true;
            }
        }
        while (!compareNumber);
    }
}


