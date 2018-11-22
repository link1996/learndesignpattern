package pojo;

import ext.Beverage;
import ext.CondimentDecorator;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description+",mocha";
    }

    @Override
    public double cost() {
        return  .20+ beverage.cost();
    }
}
