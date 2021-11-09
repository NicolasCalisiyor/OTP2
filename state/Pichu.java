package state;

public class Pichu extends EvolveState{
    
    public static final Pichu PICHU = new Pichu();

    private Pichu() {

    }

    public static Pichu getInstance() {
        return PICHU;
    }

    public void attack() {
        System.out.println("Pichu Attacks!");
    }
    public void defend() {
        System.out.println("Pichu Defends!");
    }
    public void special() {
        System.out.println("Pichu Thunderbolt!");
    }

    
    @Override
    public void evolve(PichuTemplate s) {
        
        changeState(s, Pichu.getInstance());

    }
}
