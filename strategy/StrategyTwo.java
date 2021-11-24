package strategy;

import java.util.List;

public class StrategyTwo implements ListConverter{

    @Override
    public void listToString(List<String> list) {
        // TODO Auto-generated method stub
        String[] newlist = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            newlist[i] = list.get(i); 
            
            if (i%2 == 0) {
                newlist[i] = newlist[i]+"\n";
            }
        }
    }
    
}
