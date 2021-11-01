package abstractfactory;

public class Main {

    private static ClothesFactory factory;
    public static void main(String[] args) {

        Person person = new Person("Jasper the Java Dev");
        showOff(person);
        person.setGraduation(true);
        showOff(person);
        
    }

    public static void showOff(Person person) {
        if(person.getGraduation() == true) {
            factory = new BossClothesFactory();
        }
        else {
            factory = new AdidasClothesFactory();
        }

        person.setJeans(factory.createJeans());
        person.setShoes(factory.createShoes());
        person.setTshirt(factory.createTshirt());

        System.out.println("\n" + person.getName() + " is wearing: \n" + person.getTshirt() + "\n" + person.getJeans() + "\n" + person.getShoes() + "\n");
    }
}
