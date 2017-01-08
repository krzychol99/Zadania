/**
 * Created by krzychol99 on 2017-01-07.
 */
public class OddNumberSum {
    public static void main(String[] args) {
        int[] numbes = new int[5];
        numbes[0] = 7;
        numbes[1] = 2;
        numbes[2] = 9;
        numbes[3] = 4;
        numbes[4] = 3;

        int sumOddNumbers = numbes[0] + numbes[2] + numbes[4];

        System.out.println("1st number: " + numbes[0] + ";\t3rd number: " + numbes[2] + ";\t5th number: " + numbes[4]);
        System.out.println("Sum of 1st, 3rd and 5th numbers: " + numbes[0] + " + " + numbes[2] + " + " + numbes[4] + " = " + sumOddNumbers );
    }

}
