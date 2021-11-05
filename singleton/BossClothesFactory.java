package singleton;


public class BossClothesFactory implements ClothesFactory{

    public static final BossClothesFactory FACTORY = new BossClothesFactory();

    private BossClothesFactory() {

    }

    public static BossClothesFactory getInstance() {
        return FACTORY;
    }

    public Jeans createJeans() {
        return new BossJeans();
    }

    public Tshirt createTshirt() {
        return new BossTshirt();
    }

    public Shoes createShoes() {
        return new BossShoes();
    }
    
}
