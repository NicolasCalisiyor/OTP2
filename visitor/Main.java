package visitor;

public class Main {
    public static void main(String[] args) {
        
        final Character character = new Character();
        final CharacterStateVisitor visitor = new CharacterVisitor(); 

        character.stateName();
        character.attack();
        character.defend();
        character.accept(visitor);

        System.out.println("\n");

        character.setState(new LevelTwo());
        character.stateName();
        character.attack();
        character.defend();
        character.accept(visitor);

        System.out.println("\n");

        character.setState(new LevelThree());
        character.stateName();
        character.attack();
        character.defend();
        character.accept(visitor);

    }
}