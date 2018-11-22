package pojo;

import impl.FlyBehavior;
import impl.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    //委托quackBehavior调用
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("Duck swim");
    }
    public abstract void  display();
    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
