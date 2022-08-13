package Character.Character_class;

import Character.waepon_interface.WeaponBehavior;

public abstract class Character {
    public WeaponBehavior weaponBehavior;

    public void  fight(){
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
