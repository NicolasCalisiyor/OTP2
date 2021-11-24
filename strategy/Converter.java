package strategy;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    
    private List<String> list; 
    private ListConverter strategy;
    
    public Converter(ListConverter strategy) { 
        this.list = new ArrayList<String>(); 
        this.strategy = strategy; 
    }
    public void addToList(String item) { 
        list.add(item); 
    }
    public void printList() { 
        
        strategy.listToString(list);
        
        for (String i : list) { 
            System.out.println(i);
        }
    }
    
    public void setStrategy(ListConverter strategy) { 
        this.strategy = strategy; 
    }
}
