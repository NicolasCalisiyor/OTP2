package state2;

public class Pichu implements PokemonState{
    

    @Override
    public void attack() {
        System.out.println("Pichu Attacks!");
        
    }

    @Override
    public void defend() {
        System.out.println("Pichu Defends!");
        
    }

    @Override
    public void special() {
        System.out.println("Pichu Thunder Shock!");
        
    }
}