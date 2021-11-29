package builder;

public class Main {

    public static void main(String[] args) {
        
        Director director = new Director();

        McDonaldsBuilder mcd = new McDonaldsBuilder();

        director.setBurgerBuilder(mcd);
        director.constructBurger();

        McDonalds mcdBurger = mcd.getBurger();

        System.out.println(mcdBurger);

        
        System.out.println("\n");
        

        BurgerBuilder bk = new BurgerKingBuilder();

        director.setBurgerBuilder(bk);
        director.constructBurger();

        BurgerKing bkBurger = (BurgerKing) bk.getBurger();

        System.out.println(bkBurger);

    }
}