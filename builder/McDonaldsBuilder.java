package builder;

public class McDonaldsBuilder implements BurgerBuilder {

    private McDonalds burger;

    @Override
    public void createNewBurgerProduct() {
        // TODO Auto-generated method stub
        burger = new McDonalds();
        
    }

    @Override
    public void buildBuns() {
        // TODO Auto-generated method stub
        burger.setBuns(new Bun("Sesame Bun"));
        
    }

    @Override
    public void buildSauce() {
        // TODO Auto-generated method stub
        burger.setSauce(new Sauce("Szechuan Sauce"));
        
    }

    @Override
    public void buildTopping() {
        // TODO Auto-generated method stub
        burger.setTopping(new Topping("Beef, Lettuce and Tomatoes"));
        
    }

    @Override
    public McDonalds getBurger() {
        // TODO Auto-generated method stub
        return burger;
    }
    
}
