
import characters.Character;
import java.util.Objects;
import java.util.function.Consumer;

public class GameManager {
    private final Consumer<String> logger;

    public GameManager() {
        this(System.out::println);
    }

    public GameManager(Consumer<String> logger) {
        this.logger = Objects.requireNonNull(logger);
    }

    public void fight(Character c1, Character c2) {
        logger.accept("Fight: " + c1.getClass().getSimpleName() + " vs " + c2.getClass().getSimpleName());
        int rounds = 0;

        while (c1.isAlive() && c2.isAlive()) {
            rounds++;
            step(c1, c2);
            if (!c2.isAlive()) {
                break;
            }
            step(c2, c1);
            if (rounds > 50) {
                logger.accept("The game is too long");
                break;
            }
        }
        Character winner = c1.isAlive() ? c1 : c2;
        Character loser = c1.isAlive() ? c2 : c1;
        logger.accept("Winner: " + winner.getClass().getSimpleName() + ", Loser: " + loser.getClass().getSimpleName());
    }

    private void step(Character attacker, Character defender) {
        int beforeHp = defender.getHp();
        int beforePow = defender.getPower();

        attacker.kick(defender);

        int deltaHp = beforeHp - defender.getHp();
        int deltaPow = beforePow - defender.getPower();

        StringBuilder sb = new StringBuilder();

        sb.append(attacker.getClass().getSimpleName())
          .append(" -> ")
          .append(defender.getClass().getSimpleName())
          .append(": ");

        if (deltaHp != 0) 
            sb.append("HP -").append(deltaHp).append(" ");

        if (deltaPow != 0) 
            sb.append("POW -").append(deltaPow).append(" ");

        if (deltaHp == 0 && deltaPow == 0) 
            sb.append("no effect");

        sb.append("| ").append("Defender HP=").append(defender.getHp())
          .append(" POW=").append(defender.getPower());

        logger.accept(sb.toString());
    }
}
