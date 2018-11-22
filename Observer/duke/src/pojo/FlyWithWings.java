package pojo;

import impl.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
