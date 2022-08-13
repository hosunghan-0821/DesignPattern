package Character.weapon_class;

import Character.waepon_interface.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("도끼로 적을 뱁니다.");
    }
}
