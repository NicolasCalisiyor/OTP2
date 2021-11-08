package decorator;

public abstract class PizzaDecorator implements Pizza{
    
    protected Pizza pizzaToBeDecorated;

    public PizzaDecorator(Pizza pizzaToBeDecorated) {
        this.pizzaToBeDecorated = pizzaToBeDecorated;
    }

    public String getDescription() {
        return pizzaToBeDecorated.getDescription();
    }

    public double getPrice() {
        return pizzaToBeDecorated.getPrice();
    }

}
