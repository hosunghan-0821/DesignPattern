package Character;

import Character.Character_class.Character;
import Character.Character_class.King;
import Character.Character_class.Queen;
import Character.Character_class.Troll;
import Character.weapon_class.AxeBehavior;

public class MiniCharacterSimulator {
    public static void main(String args[]){
        Character king  = new King();
        Character queen = new Queen();
        Character Troll = new Troll();
        king.fight();
        queen.fight();
        Troll.fight();
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();
    }
}
