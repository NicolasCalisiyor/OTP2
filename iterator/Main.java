package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        for(int i = 1; i <= 100; i++) {
            list.add("Number: " + i);
        }

        MyThread i = new MyThread(list.iterator(), list);
        MyThread i2 = new MyThread(list.iterator(), list);

        i.start();
        i2.start();

        while(i2.isAlive() || i.isAlive()) {
            try {
                i.join();
                i2.join();

            } catch (Exception e) {
                //TODO: handle exception
            }
            System.out.println("\n");


            Iterator<String> iterator = list.iterator();
            MyThread i3 = new MyThread(iterator, list);
                
            i3.start();
        }
    }
}
