package Character;

import Character.Character_class.Character;
import Character.Character_class.King;
import Character.Character_class.Queen;
import Character.Character_class.Troll;
import Character.weapon_class.AxeBehavior;

public class MiniCharacterSimulator {
    public static void main(String args[]){
        Character king  = new King();
        king.fight();
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();
    }
}
