package decorator;

public class Chicken extends PizzaDecorator{

    private double price;

    public Chicken(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
        this.price = 2.0;
    }

    public double getPrice() {
        return super.getPrice() + price;
    }

    public String getDescription(){
        return super.getDescription() + "Chicken ";
    }

}
