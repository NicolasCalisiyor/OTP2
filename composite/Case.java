package composite;
import java.util.ArrayList;

public class Case implements ComputerPart{
    
    private double price;
    private ArrayList<ComputerPart> parts = new ArrayList<ComputerPart>();

    public Case (double price) {
        this.price = price;
    }

    public void addPart(ComputerPart part) {
        parts.add(part);
    }
    public void removePart(ComputerPart part) {
        parts.remove(part);
    }

    public double getPrice() {
        double priceSum = price;
        for(int i = 0; i < parts.size(); i++) {
            priceSum += parts.get(i).getPrice();
        }
        
        double roundedPrice = (double) Math.round(priceSum * 100) / 100;
        return roundedPrice;
    }
}
