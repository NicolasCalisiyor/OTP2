package visitor;

public interface CharacterState {
    
    void attack();
    void defend();
    void accept(CharacterStateVisitor visitor);
    void bonus();
    void stateName();

}
