package kickstrategy;

import characters.Character;

public class ElfPower implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character whoIsKicked){
        if (whoIsKicked.getPower() < whoKick.getPower()) {
            whoIsKicked.setHp(0);
        }
        else{
            whoIsKicked.setPower(Math.max(0, whoIsKicked.getPower() - 1));
        }
    }

}
