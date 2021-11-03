package abstractfactory;

public class BossClothesFactory implements ClothesFactory{

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
