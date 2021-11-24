package strategy;

public class Main {
    
    public static void main(String[] args) {

        Converter c = new Converter(new StrategyOne());

        c.addToList("First");
        c.addToList("Second");
        c.addToList("Third");
        c.addToList("Fourth");
        c.addToList("Fifth");

        c.printList();

        c.setStrategy(new StrategyTwo());
        
        c.printList();

        c.setStrategy(new StrategyThree());

        c.printList();
    }
}
