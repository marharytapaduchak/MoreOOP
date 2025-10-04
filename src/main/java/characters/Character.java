package characters;
// import javax.annotation.processing.Generated;

import kickstrategy.KickStrategy;
import lombok.Getter;

@Getter

public abstract class Character {
    protected int power;
    protected int hp;
    protected KickStrategy kickStrategy;

    protected Character() {}

    protected Character(int power, int hp, KickStrategy strategy) {
        setPower(power);
        setHp(hp);
        this.kickStrategy = strategy;
    }

    public void setPower(int power) {
        this.power = Math.max(0, power);
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public void setKickStrategy(KickStrategy kickStrategy) {
        this.kickStrategy = kickStrategy;
    }
    
    public abstract void kick(Character c);

    public boolean isAlive(){
            return hp>0;  
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
