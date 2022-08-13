package Character.Character_class;

import Character.waepon_interface.WeaponBehavior;
import Character.weapon_class.KnifeBehavior;

public class Knight extends Character {
    public Knight(){
        this.weaponBehavior=new KnifeBehavior();
    }
}
