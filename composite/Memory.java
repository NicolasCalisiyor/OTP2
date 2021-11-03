package composite;

public class Memory implements ComputerPart{
    
    private double price;

    public Memory (double price) {
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
