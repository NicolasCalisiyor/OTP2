package decorator;

public class Pepperoni extends PizzaDecorator{

    private double price;

    public Pepperoni(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
        this.price = 0.5;
    }

    public double getPrice() {
        return super.getPrice() + price;
    }

    public String getDescription(){
        return super.getDescription() + "Pepperoni ";
    }

}
