package decorator;

public class GroundBeef extends PizzaDecorator{

    private double price;

    public GroundBeef(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
        this.price = 6.0;
    }

    public double getPrice() {
        return super.getPrice() + price;
    }

    public String getDescription(){
        return super.getDescription() + "Ground Beef ";
    }

}
