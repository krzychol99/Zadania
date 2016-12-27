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

        System.out.println(triangleChecker.isRightTriangle(triangle0));
        System.out.println(triangleChecker.isRightTriangle(triangle1));
        System.out.println(triangleChecker.isRightTriangle(triangle2));
        System.out.println(triangleChecker.isRightTriangle(triangle3));
    }
}
