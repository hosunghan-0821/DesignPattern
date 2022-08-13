package Duck.behavior_class;

import Duck.behavior_interface.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("말 못하는 오리에욤!");
    }
}
