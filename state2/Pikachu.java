package state2;

public class Pikachu implements PokemonState{
    

    @Override
    public void attack() {
        System.out.println("Pikachu Attacks!");
        
    }

    @Override
    public void defend() {
        System.out.println("Pikachu Defends!");
        
    }

    @Override
    public void special() {
        System.out.println("Pikachu Wild Charge!");
        
    }
}