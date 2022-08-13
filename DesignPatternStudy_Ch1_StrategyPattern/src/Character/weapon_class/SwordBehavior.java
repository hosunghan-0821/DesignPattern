package Character.weapon_class;

import Character.waepon_interface.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("칼로 적을 가릅니다.");
    }
}
