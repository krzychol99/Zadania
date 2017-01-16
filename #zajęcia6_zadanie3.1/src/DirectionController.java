import java.util.Scanner;

/**
 * Created by MałaMi on 2017-01-16.
 */
public class DirectionController {
    public static void main(String[] args) {
        Direction [] directions = Direction.values();

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj kierunek geograficzny: ");

        for (int i = 0; i < directions.length - 1; i++) {
            System.out.println(i + " - " + directions[i]);
        }
        int userChoice = input.nextInt();

        Direction userDirection = Direction.convert(userChoice);
        System.out.println("Ok więc idziemy na " + userDirection.getDirectionName());
    }
}
