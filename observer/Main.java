package observer;

public class Main {

    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer(23, 50, 82);
        DigitalClock clock = new DigitalClock(timer);
        timer.start();

    }
}