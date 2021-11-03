package composite;

public class Main {
    public static void main (String[] args) {

        ComputerPart cpu = new CPU(309.00);
        ComputerPart videocard = new VideoCard(2479.98);
        ComputerPart memory = new Memory(138.99);
        ComputerPart cooler = new Cooler(113.49);

        ComputerPart computercase = new Case(99.90);
        ComputerPart motherboard = new Motherboard(159.99);

        motherboard.addPart(cpu); 
        motherboard.addPart(videocard);
        motherboard.addPart(memory);
        motherboard.addPart(cooler);

        computercase.addPart(motherboard);

        System.out.println("\n Build Cost: \n CPU price: " + cpu.getPrice() + "\n Video Card price: " + videocard.getPrice() + "\n Memory price: " + memory.getPrice() + "\n Cooler price: " + cooler.getPrice() + 
        "\n\n Motherboard price with added parts: " + motherboard.getPrice() + " \n\n Case price with all of the above: " + computercase.getPrice() + "\n\n");

    }
}
