package composite;

public class Cooler implements ComputerPart{
    
    private double price;

    public Cooler (double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void addPart(ComputerPart part) {
        // TODO Auto-generated method stub
        
    }
}
