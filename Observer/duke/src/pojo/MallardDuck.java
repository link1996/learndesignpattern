package pojo;

public class MallardDuck extends Duck{

    //任然不是针对接口编程 还是实现编程
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }

    public static void main(String[] args) {
        new MallardDuck().performFly();
    }
}
