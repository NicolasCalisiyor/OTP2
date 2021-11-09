package state;

public abstract class EvolveState {
    
    void attack() {}
    void defend() {}
    void special() {}

    void evolve(PichuTemplate s) {}
    void changeState(PichuTemplate s, EvolveState p){
        s.changeState(p);
    }

}
