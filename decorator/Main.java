package decorator;

public class Main {

    public static void main(String[] args) {
        
        Pizza pizzatime = new Pepperoni(new Chicken(new Paprika( new EmptyPizza("Maguire"))));
        Pizza tunapizza = new Tuna(new Onion(new EmptyPizza("Tuna Time")));
        Pizza bolognese = new GroundBeef(new EmptyPizza("Bolognese"));

        System.out.println("\nPizza Menu: ");
        System.out.println(pizzatime.getDescription() + "  Price: " + pizzatime.getPrice() + "€");
        System.out.println(tunapizza.getDescription() + "  Price: " + tunapizza.getPrice() + "€");
        System.out.println(bolognese.getDescription() + "  Price: " + bolognese.getPrice() + "€");

    }

}