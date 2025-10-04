import characters.Character;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter(){
        Reflections reflections = new Reflections("characters");
        
        Set< Class<? extends Character>> setOfTypes = reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> subTypes = new ArrayList<>();
        subTypes.addAll(setOfTypes);

        return subTypes.get(new Random().nextInt(subTypes.size())).getDeclaredConstructor().newInstance();
    }
}
