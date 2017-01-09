import java.util.Scanner;

/**
 * Created by krzychol99 on 2017-01-08.
 */
public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        String helloNames = "Hello ";
        int i = 0;
        System.out.println("Enter 5 names: ");
        while (i < names.length ){
            names[i] = input.nextLine();
            i++;
        }
        int counter = names.length - 1;
        while(counter >= 0){
            System.out.println(helloNames + " " + names[counter]);
            counter--;
        }
    }

}
