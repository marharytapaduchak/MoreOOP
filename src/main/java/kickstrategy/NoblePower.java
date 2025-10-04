package kickstrategy;

import java.util.Random;
import characters.Character;

public class NoblePower implements KickStrategy {
    public static Random RANDOM_GENERATOR = new Random();

    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        int dmg = RANDOM_GENERATOR.nextInt(whoKick.getPower()) + 1;
        whoIsKicked.setHp(Math.max(whoIsKicked.getHp() - dmg,0));
    }
}
