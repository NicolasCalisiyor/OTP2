package visitor;


public interface CharacterStateVisitor {
    public void visit(LevelOne levelOne);
    public void visit(LevelTwo levelTwo);
    public void visit(LevelThree levelThree);
}
