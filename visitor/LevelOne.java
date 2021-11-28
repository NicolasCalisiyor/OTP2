package visitor;

public class LevelOne implements CharacterState{


    @Override
    public void attack() {
        System.out.println("Weak attack!");
    }

    @Override
    public void defend() {
        System.out.println("Weak block!");
        
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
        System.out.println("You're level 1");
        
    }

    
}
