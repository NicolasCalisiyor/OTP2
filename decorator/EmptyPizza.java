package decorator;

public class EmptyPizza implements Pizza{

    private double price;
    private String name;

    public EmptyPizza(String name) {
        this.price = 2.0;
        this.name = name;
    }


    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "" + name + ": ";
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        return price;
    }
    
}
