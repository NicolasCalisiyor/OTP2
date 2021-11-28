package visitor;

public class Character implements CharacterState{
    

    private CharacterState state;

    public Character() {
        setState(new LevelOne());
    }
    public Character(final CharacterState state) {
        this.state = state;
    }

    public void setState(final CharacterState state) {
        this.state = state;
    }

    public CharacterState getState() {
        System.out.println(state.getClass().getName());
        return state;
    }

    @Override
    public void attack() {
        state.attack();
        
    }

    @Override
    public void defend() {
        state.defend();
        
    }

    @Override
    public void accept(CharacterStateVisitor visitor) {
        // TODO Auto-generated method stub
        state.accept(visitor);
        
    }
    @Override
    public void bonus() {
        // TODO Auto-generated method stub
        state.bonus();
        
    }
    @Override
    public void stateName() {
        // TODO Auto-generated method stub
        state.stateName();
        
    }
}
