package characters;

import kickstrategy.CryStrategy;

public class Hobbit extends Character{
    public Hobbit(){
        super(0,3,new CryStrategy());
    }

    @Override
    public void kick(Character enemy){
        kickStrategy.kick(this, enemy);
    }
}
