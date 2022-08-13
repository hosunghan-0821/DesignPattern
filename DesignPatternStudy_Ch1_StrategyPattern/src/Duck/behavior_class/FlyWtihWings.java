package Duck.behavior_class;

import Duck.behavior_interface.FlyBehavior;

public class FlyWtihWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("오리가 날아유");
    }
}
