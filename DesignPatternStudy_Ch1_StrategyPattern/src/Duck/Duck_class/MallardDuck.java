package Duck.Duck_class;

import Duck.behavior_class.FlyWtihWings;
import Duck.behavior_class.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        this.flyBehavior = new FlyWtihWings();
        this.quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println();
    }
}
