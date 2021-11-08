package decorator;

public class Paprika extends PizzaDecorator{

    private double price;

    public Paprika(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
        this.price = 2.0;
    }

    public double getPrice() {
        return super.getPrice() + price;
    }

    public String getDescription(){
        return super.getDescription() + "Paprika ";
    }

}
