package state;

public class Raichu extends EvolveState{
    
    public static final Raichu RAICHU = new Raichu();

    private Raichu() {

    }

    public static Raichu getInstance() {
        return RAICHU;
    }

    public void attack() {
        System.out.println("Raichu Attacks!");
    }
    public void defend() {
        System.out.println("Raichu Defends!");
    }
    public void special() {
        System.out.println("Raichu Thunderbolt!");
    }

    
    @Override
    public void evolve(PichuTemplate s) {
        System.out.println("Raichu cant evol");
    }
}
