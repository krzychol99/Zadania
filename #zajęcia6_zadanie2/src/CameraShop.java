/**
 * Created by MałaMi on 2017-01-16.
 */
public class CameraShop {
    public static void main(String[] args) {
        Camera camera1 = new Camera("Nikon", "D5300", 1.254 ,2016);
        Camera camera2 = new Camera("Cannon", "XY234", 0.890, 2015);
        Camera camera3 = new Camera("Nikon", "D5300", 1.254, 2016);

        System.out.println(camera1);
        System.out.println(camera2);
        System.out.println(camera3);

        if (camera1.equals(camera2))
            System.out.println("Camera camer1 and camera2 are identical");
        if(camera1.equals(camera3))
            System.out.println("Camera camer1 and camera3 are identical");
        if(camera2.equals(camera3))
            System.out.println("Camera camer2 and camera3 are identical");
    }
}
