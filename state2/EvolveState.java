package state2;

public class EvolveState {

    private PokemonState currentState;

    public EvolveState() {
        currentState = new Pichu();
    }

    public void evolve(PokemonState state) {
        String temp = currentState.getClass().getSimpleName();
        currentState = state;

        System.out.println("\n" + temp + " evolves into a " + state.getClass().getSimpleName() + "\n");
    }

    public void attack() {
        currentState.attack();
    }
    public void defend() {
        currentState.defend();
    }
    public void special() {
        currentState.special();
    }
}
