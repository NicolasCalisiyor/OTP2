package singleton;

public class Main {

    private static ClothesFactory factory;
    public static void main(String[] args) {

        Person person = new Person("Jasper");
        showClothes(person);
        person.setGraduation(true);
        showClothes(person);
        
    }

    public static void showClothes(Person person) {
        if(person.getGraduation() == true) {
            factory = BossClothesFactory.getInstance();
        }
        else {
            factory = AdidasClothesFactory.getInstance();
        }

        person.setJeans(factory.createJeans());
        person.setShoes(factory.createShoes());
        person.setTshirt(factory.createTshirt());

        System.out.println("\n" + person.getName() + " is wearing: \n" + person.getTshirt() + "\n" + person.getJeans() + "\n" + person.getShoes() + "\n");
    }
}
