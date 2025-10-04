import characters.Character;

public class Demo {
    public static void main(String args[]) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        new GameManager().fight(c1, c2);
    }
}
