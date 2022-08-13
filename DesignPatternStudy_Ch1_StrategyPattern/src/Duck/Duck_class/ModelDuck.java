package Duck.Duck_class;

import Duck.behavior_class.FlyNoWAY;
import Duck.behavior_class.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior= new FlyNoWAY();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
