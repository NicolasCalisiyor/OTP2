package observer;

import java.util.Observable;

public class ClockTimer extends Observable implements Runnable{

    private int seconds;
    private int minutes;
    private int hours;

    public ClockTimer(int hour, int minute, int second) {
        this.seconds = second;
        this.minutes = minute;
        this.hours = hour;
    }

    public int getSeconds() {
        return seconds;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getHours() {
        return hours;
    }


    public void tick() {
        seconds++;
        if(seconds >= 60) {
            minutes++;
            seconds = 0;
        }
        if(minutes >= 60) {
            hours++;
            minutes = 0;

            if(hours >= 24) {
                hours = 0;
            }
        }
        setChanged();
        this.notifyObservers();
    }

    public void start() {
        new Thread(this).start();
    }


    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            try {
                //System.out.println("testi" + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.tick();
        }
        
    }
    
}
