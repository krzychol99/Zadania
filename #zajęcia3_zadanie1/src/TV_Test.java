/**
 * Created by MałaMi on 2016-12-23.
 */
public class TV_Test {
    public static void main(String[] args) {
        Television television = new Television("TURN-OFF");
            television.showStatus();
            television.turnOn();
            television.showStatus();
            television.turnOff();
            television.showStatus();
    }
}
