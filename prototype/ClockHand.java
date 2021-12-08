package prototype;

public class ClockHand implements Cloneable{
    
    private int time;
    private int max;

    public ClockHand(int max) {
        this.time = 0;
        this.max = max;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return this.time;
    }

    public String toString() {
        return String.valueOf(this.time);
    }

    public Object clone() {

        try {
            return super.clone();
        } catch (Exception e) {
            
            return null;
        }
    }
}
