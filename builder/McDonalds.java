package builder;

public class McDonalds {
    
    private Bun bun;
    private Sauce sauce;
    private Topping topping;

    public void setBuns(Bun bun) { 
        this.bun = bun; 
    }
    public void setSauce(Sauce sauce) { 
        this.sauce = sauce; 
    }
    public void setTopping(Topping topping) { 
        this.topping = topping; 
    }

    


    public String toString() {
        return bun.toString() +"\n"+ sauce.toString() +"\n"+ topping.toString();
    } 
}
