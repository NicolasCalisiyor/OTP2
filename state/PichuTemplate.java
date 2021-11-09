package state;

public class PichuTemplate {
    
    private EvolveState state;

    public PichuTemplate() {
        state = Pichu.getInstance();
    }

    public void attack() {
        state.attack();
    }

    public void defend() {
        state.defend();
    }

    public void special() {
        state.special();
    }
    
    protected void evolve() {
        state.evolve(this);
    }
    
    protected void changeState(EvolveState p) {
        state = p;
    }

    
}
