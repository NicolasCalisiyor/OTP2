package abstractfactory;

public class AdidasClothesFactory implements ClothesFactory{

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
