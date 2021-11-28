package visitor;

public class LevelThree implements CharacterState{

    @Override
    public void attack() {
        System.out.println("Strong attack!");
        
    }

    @Override
    public void defend() {
        System.out.println("Strong block!");
        
    }

    @Override
    public void accept(CharacterStateVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void bonus() {
        // TODO Auto-generated method stub
        System.out.println("Bonus stuff or something?");
        
    }

    @Override
    public void stateName() {
        // TODO Auto-generated method stub
        System.out.println("You're level 3");
        
    }
    
}
