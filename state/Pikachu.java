package state;

public class Pikachu extends EvolveState{
    
    public static final Pikachu PIKACHU = new Pikachu();

    private Pikachu() {

    }

    public static Pikachu getInstance() {
        return PIKACHU;
    }

    public void attack() {
        System.out.println("Pikachu Attacks!");
    }
    public void defend() {
        System.out.println("Pikachu Defends!");
    }
    public void special() {
        System.out.println("Pikachu Thunderbolt!");
    }

    
    @Override
    public void evolve(PichuTemplate s) {
        
        changeState(s, Pikachu.getInstance());

    }
}
