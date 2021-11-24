package strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StrategyOne implements ListConverter{

    @Override
    public void listToString(List<String> list) {
        // TODO Auto-generated method stub
        List newList = new ArrayList();
        
        Iterator iterator = list.iterator();
      
        while(iterator.hasNext()) {
           Object element = iterator.next();
           element = element+"\n";
           newList.add(element);
        }
    }
    
}
