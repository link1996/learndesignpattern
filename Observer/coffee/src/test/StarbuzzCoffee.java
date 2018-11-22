package test;

import ext.Beverage;
import pojo.Espresso;
import pojo.Mocha;

public class StarbuzzCoffee{
    public static void main(String[] args) {
        Beverage beverage =new Espresso();
        System.out.println(beverage.getDescription());

        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription());
    }
}
