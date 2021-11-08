package decorator;

public class Onion extends PizzaDecorator{

    private double price;

    public Onion(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
        this.price = 1.1;
    }

    public double getPrice() {
        return super.getPrice() + price;
    }

    public String getDescription(){
        return super.getDescription() + "Onion ";
    }

}
