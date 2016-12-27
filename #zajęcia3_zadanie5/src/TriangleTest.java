/**
 * Created by krzychol99 on 2016-12-26.
 */
public class TriangleTest {
    public static void main(String[] args) {

        Triangle triangle0 = new Triangle(4, 3, 5);
        Triangle triangle1 = new Triangle(2,3,7);
        Triangle triangle2 = new Triangle(3,4,5);
        Triangle triangle3 = new Triangle(3,3,3);

        TriangleChecker triangleChecker = new TriangleChecker();

        System.out.println("Triangle 1st is right-angled: " + triangleChecker.isRightTriangle(triangle0));
        System.out.println("Triangle 2nd is right-angled: " + triangleChecker.isRightTriangle(triangle1));
        System.out.println("Triangle 3rd is right-angled: " + triangleChecker.isRightTriangle(triangle2));
        System.out.println("Triangle 4th is right-angled: " + triangleChecker.isRightTriangle(triangle3));
    }
}
