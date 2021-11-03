package abstractfactory;

public class Person {

    private String name;
    private Jeans jeans;
    private Shoes shoes;
    private Tshirt tshirt;

    private boolean graduated = false;

    public Boolean getGraduation() {
        return graduated;
    }

    public void setGraduation(boolean graduated) {
        this.graduated = graduated;
        System.out.println(this.getName() + " becomes a Engineer Graduate");
    }
    
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Jeans getJeans() {
        return jeans;
    }

    public void setJeans(Jeans jeans) {
        this.jeans = jeans;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Tshirt getTshirt() {
        return tshirt;
    }

    public void setTshirt(Tshirt tshirt) {
        this.tshirt = tshirt;
    }

}
