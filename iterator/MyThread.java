package iterator;

import java.util.Iterator;
import java.util.List;

public class MyThread extends Thread{
    
    Iterator<String> iterator;
    List<String> list;

    public MyThread(Iterator<String> i, List<String> list) {
        this.iterator = i;
        this.list = list;
    }

    public void run() {

        while(this.iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
