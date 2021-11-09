package state;

public class Main {
    public static void main(String[] args) {
        
        PichuTemplate pokemon = new PichuTemplate();

        pokemon.attack();
        pokemon.defend();
        pokemon.evolve();

        pokemon.defend();
        pokemon.special();
        pokemon.evolve();

        pokemon.attack();
    }
}
