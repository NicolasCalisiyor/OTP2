package state2;

public class Raichu implements PokemonState{
    

    @Override
    public void attack() {
        System.out.println("Raichu Attacks!");
        
    }

    @Override
    public void defend() {
        System.out.println("Raichu Defends!");
        
    }

    @Override
    public void special() {
        System.out.println("Raichu Volt Switch!");
        
    }
}