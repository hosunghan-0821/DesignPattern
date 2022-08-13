package Duck.behavior_class;

import Duck.behavior_interface.FlyBehavior;

public class FlyNoWAY implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
