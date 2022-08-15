package Duck;

import Duck.Duck_class.Duck;
import Duck.Duck_class.MallardDuck;
import Duck.Duck_class.ModelDuck;
import Duck.behavior_class.FlyNoWAY;
import Duck.behavior_class.FlyRocketPowered;
import Duck.behavior_interface.FlyBehavior;

public class MiniDuckSimulator {
    public static void main(String args[]){
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();

        FlyBehavior fb= new FlyNoWAY();
        mallard.setFlyBehavior(fb);



//        Duck model = new ModelDuck();
//        model.performFly();
//        model.setFlyBehavior(new FlyRocketPowered());
//        model.performFly();
    }
}
