package prototype;

public class Main {
    
    public static void main(String[] args) {
    
        Clock clock = new Clock();
        Clock clone = (Clock) clock.clone();
        Clock copy = clock.copy();

        
        clock.setTime(20, 22, 3);
        System.out.println("Time: " + clock.time() + " \nClone: " + clone.time() + " \nCopy: " + copy.time());

        clock.setTime(23, 22, 41);
        System.out.println("Time: " + clock.time() + " \nClone: " + clone.time() + " \nCopy: " + copy.time());
        
        clock.setTime(4, 55, 31);
        System.out.println("Time: " + clock.time() + " \nClone: " + clone.time() + " \nCopy: " + copy.time());
        
        clock.setTime(10, 5, 12);
        System.out.println("Time: " + clock.time() + " \nClone: " + clone.time() + " \nCopy: " + copy.time());
    }
}