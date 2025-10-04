package characters;
import java.util.Random;

import kickstrategy.KickStrategy;


public abstract class Noble extends Character{
    public static Random RANDOM_GENERATOR = new Random();
    
    public Noble(int minPower, int maxPower, int minHp, int maxHp, KickStrategy strategy){
        this.power = RANDOM_GENERATOR.nextInt(maxPower - minPower + 1) + minPower;
        this.hp = RANDOM_GENERATOR.nextInt(maxHp - minHp + 1) + minHp;
        this.kickStrategy = strategy;
    }
}
