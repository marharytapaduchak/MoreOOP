package characters;

import kickstrategy.NoblePower;

public class Knight extends Noble{

    public Knight(){
        super(2, 12, 2, 12, new NoblePower());
    }
    
    @Override
    public void kick(Character enemy){
        kickStrategy.kick(this, enemy);
    }
}
