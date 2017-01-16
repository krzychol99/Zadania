/**
 * Created by MałaMi on 2017-01-16.
 */
public enum Direction {
    NORTH("Północ"),
    SOUTH("Południe"),
    EAST("Wschód"),
    WEST("Zachód"),
    UNDEFINED("nieznany");

    private String directionName;

    public String getDirectionName() {
        return directionName;
    }

    Direction(String directionName) {
        this.directionName = directionName;
    }
    public static Direction convert(int num){
        if(num < 0 || num > 3){
            return UNDEFINED;
        }else {
            Direction[] directions = values();
            return directions[num];
        }
    }
}
