package main.java.com.neoflex.task1.factory;

import static main.java.com.neoflex.task1.factory.coffee.CoffeeTypeEnum.DEFAULT;
import static main.java.com.neoflex.task1.factory.coffee.CoffeeTypeEnum.ESPRESSO;

public class Test {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        coffeeFactory.createCoffe(ESPRESSO);
        coffeeFactory.createCoffe(DEFAULT);
    }
}
