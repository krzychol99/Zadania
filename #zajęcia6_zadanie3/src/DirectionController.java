import java.util.Scanner;

/**
 * Created by MałaMi on 2017-01-16.
 */
public class DirectionController {
    public static void main(String[] args) {
        Direction[] directions = Direction.values();

        for (Direction direction: directions);

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj kierunek geograficzny: ");

        String userChoice= input.nextLine();

        Direction userDirection = Direction.valueOf(userChoice);
        System.out.println("Ok więc idziemy na " + userDirection.getDirectionName());

    }
}
