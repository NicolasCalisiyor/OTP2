package singleton;

public class AdidasClothesFactory implements ClothesFactory{

    public static final AdidasClothesFactory FACTORY = new AdidasClothesFactory();

    private AdidasClothesFactory() {

    }

    public static AdidasClothesFactory getInstance() {
        return FACTORY;
    }

    public Jeans createJeans() {
        return new AdidasJeans();
    }

    public Tshirt createTshirt() {
        return new AdidasTshirt();
    }

    public Shoes createShoes() {
        return new AdidasShoes();
    }

    
    
}
