/**
 * Created by krzychol99 on 2016-12-26.
 */
public class TriangleChecker {

    boolean isRightTriangle(Triangle triangle) {
        double powSide_C = Math.pow(triangle.sideC, 2);
        double powSide_A_B = Math.pow(triangle.sideA, 2) + Math.pow(triangle.sideB, 2);

        if (((triangle.sideA + triangle.sideB >= triangle.sideC)
                || (triangle.sideA + triangle.sideC >= triangle.sideB)
                || (triangle.sideB + triangle.sideC >= triangle.sideA)== true)
                && (powSide_C == powSide_A_B) == true){

            return true;

        } else {

            return false;
            }
    }


}
