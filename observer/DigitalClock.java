package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{

    private ClockTimer timer;

    public DigitalClock(ClockTimer currentTime) {
        timer = currentTime;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        if(o == timer) {
            draw();
        }
        
    }

    private void draw(){
        int second = timer.getSeconds();
        int minute = timer.getMinutes();
        int hour = timer.getHours();

        //clock formatting
        String zeroHour = "";
        String zeroMinute = "";
        String zeroSecond = "";


        if (hour < 10) {
            zeroHour = "0";
        }
        if (minute < 10) {
            zeroMinute = "0";
        }
        if (second < 10) {
            zeroSecond = "0";
        }

        System.out.println("Time: " + zeroHour + hour + ":" + zeroMinute + minute + ":"  + zeroSecond + second);
    }

    
}
