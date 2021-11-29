package builder;

public class Director {
    
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder bb) {
        burgerBuilder = bb;
    }

    public void constructBurger() {
        burgerBuilder.createNewBurgerProduct();
        burgerBuilder.buildBuns();
        burgerBuilder.buildSauce();
        burgerBuilder.buildTopping();
    }
}
