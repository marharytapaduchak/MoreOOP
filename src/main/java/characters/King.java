package characters;

import kickstrategy.NoblePower;

public class King extends Noble{
    
    public King(){
        super(5, 15, 5, 15, new NoblePower());
    }

    @Override
    public void kick(Character enemy){
        kickStrategy.kick(this, enemy);
    }

}
