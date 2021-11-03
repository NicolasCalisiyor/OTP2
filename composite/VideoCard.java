package composite;

public class VideoCard implements ComputerPart{
    
    private double price;

    public VideoCard (double price) {
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
