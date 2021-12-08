package prototype;

public class Clock implements Cloneable{
        private ClockHand hour;
        private ClockHand minute;
        private ClockHand second;

        public Clock() {
            this.hour = new ClockHand(24);
            this.minute = new ClockHand(60);
            this.second = new ClockHand(60);
        }

        public String time(){
            String time =  hour + ":" + minute + ":" + second;
            return time;
        }

        public void setTime(int hour, int min, int sec) {
            this.hour.setTime(hour);
            this.minute.setTime(min);
            this.second.setTime(sec);
        }

        public Object clone() {
            try {
                return super.clone();
            } catch (Exception e) {
                return null;
            }
        }

        public Clock copy() {
            Clock clock = null;

            try {
                clock = (Clock)super.clone();
                clock.hour = (ClockHand) this.hour.clone();
                clock.minute = (ClockHand) this.minute.clone();
                clock.second = (ClockHand) this.second.clone();
                return clock;

            } catch (Exception e) {
                //TODO: handle exception
                return null;
            }
        }
}
