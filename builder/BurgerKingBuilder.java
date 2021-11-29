package builder;

public class BurgerKingBuilder implements BurgerBuilder{

    private BurgerKing burger;

    @Override
    public void createNewBurgerProduct() {
        // TODO Auto-generated method stub
        burger = new BurgerKing();
        
    }

    @Override
    public void buildBuns() {
        // TODO Auto-generated method stub
        burger.setBuns(new Bun("Potato Bun"));
        
    }

    @Override
    public void buildSauce() {
        // TODO Auto-generated method stub
        burger.setSauce(new Sauce("Garlic Sauce"));
        
    }

    @Override
    public void buildTopping() {
        // TODO Auto-generated method stub
        burger.setTopping(new Topping("Chicken, Lettuce, Bacon"));
        
    }

    @Override
    public BurgerKing getBurger() {
        // TODO Auto-generated method stub
        return burger;
    }
    
}
