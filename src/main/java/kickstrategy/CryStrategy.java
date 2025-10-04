package kickstrategy;

import characters.Character;


public class CryStrategy implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character whoIsKicked){
        toCry();
    }

    private void toCry() {
        System.out.println("😭😭😭");
    } 
}
