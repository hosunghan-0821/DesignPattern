package Duck.behavior_class;

import Duck.behavior_interface.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다");
    }
}
