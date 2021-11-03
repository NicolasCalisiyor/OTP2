package composite;

public class CPU implements ComputerPart{
    
    private double price;

    public CPU(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void addPart() {
        
    }

    @Override
    public void addPart(ComputerPart part) {
        // TODO Auto-generated method stub
        
    }
}
