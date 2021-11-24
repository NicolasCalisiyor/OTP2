package strategy;

import java.util.List;

public class StrategyThree implements ListConverter{

    @Override
    public void listToString(List<String> list) {
        // TODO Auto-generated method stub
        String[] newlist = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            
            if (i%3 == 0) {
                 newlist[i] = list.get(i)+"\n";
            }
        }
    }
    
}
