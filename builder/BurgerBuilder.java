package builder;

public interface BurgerBuilder {
    
    public abstract void createNewBurgerProduct();
    public abstract void buildBuns();
    public abstract void buildSauce();
    public abstract void buildTopping();
    public abstract Object getBurger(); 
}
