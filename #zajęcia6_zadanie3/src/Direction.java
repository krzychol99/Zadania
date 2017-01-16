/**
 * Created by MałaMi on 2017-01-16.
 */
public enum Direction {
    NORTH("Północ"),
    SOUTH("Południe"),
    EAST("Wschód") ,
    WEST("Zachód");

    private String directionName;

    public String getDirectionName() {
        return directionName;
    }

    Direction(String directionName) {
        this.directionName = directionName;
    }
}
