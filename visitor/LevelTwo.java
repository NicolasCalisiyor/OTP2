package visitor;

public class LevelTwo implements CharacterState{

    @Override
    public void attack() {
        System.out.println("Solid attack!");
        
    }

    @Override
    public void defend() {
        System.out.println("Solid block!");
        
    }

    @Override
    public void accept(CharacterStateVisitor visitor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void bonus() {
        // TODO Auto-generated method stub
        
        System.out.println("Bonus stuff or something?");
    }
    
    @Override
    public void stateName() {
        // TODO Auto-generated method stub
        System.out.println("You're level 2");
        
    }
}
