/**
 * Created by krzychol99 on 2016-12-23.
 */
public class Television {
    String tvStatus;

    Television(String tvStatus){
        this.tvStatus = tvStatus;
    }

    void turnOn(){
        tvStatus = "TURN-ON";
    }
    void turnOff(){
        tvStatus= "TURN-OFF";
    }
    void showStatus(){
        String showTVStatus = "TV-STATUS: "+tvStatus;
        System.out.println(showTVStatus);
    }
}
