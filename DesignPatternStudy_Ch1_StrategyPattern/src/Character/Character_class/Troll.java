package Character.Character_class;

import Character.weapon_class.AxeBehavior;
import Character.weapon_class.BowAndArrowBehavior;

public class Troll extends Character{
    public Troll(){
        this.weaponBehavior=new AxeBehavior();
    }
}
