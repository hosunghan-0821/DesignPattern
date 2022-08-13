package Character.weapon_class;

import Character.waepon_interface.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("활을 쏴 적을 때립니다.");
    }
}
