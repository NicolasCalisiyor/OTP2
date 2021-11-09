package state2;

public class Main {
    public static void main(String[] args) {

        EvolveState pokemon = new EvolveState();

        pokemon.attack();
        pokemon.special();

        pokemon.evolve(new Pikachu());
        pokemon.defend();
        pokemon.special();

        pokemon.evolve(new Raichu());
        pokemon.special();
        
    }
}
