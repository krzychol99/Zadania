import java.util.Arrays;

/**
 * Created by krzychol99 on 2017-01-07.
 */
public class NamesArray {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Tytus";
        names[1] = "Romek";
        names[2] = "Atomek";

        String arrayString = Arrays.toString(names);
        System.out.println(arrayString);
    }
}
