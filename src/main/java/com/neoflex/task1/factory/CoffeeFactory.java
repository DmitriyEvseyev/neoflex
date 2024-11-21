package main.java.com.neoflex.task1.factory;

import main.java.com.neoflex.task1.factory.coffee.Americano;
import main.java.com.neoflex.task1.factory.coffee.Coffee;
import main.java.com.neoflex.task1.factory.coffee.CoffeeTypeEnum;
import main.java.com.neoflex.task1.factory.coffee.Espresso;

public class CoffeeFactory {
    public Coffee createCoffe(CoffeeTypeEnum coffeeTypeEnum) {
        Coffee coffee = null;
        switch (coffeeTypeEnum) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            default:
                throw new IllegalArgumentException("Wrong coffee type: " + coffeeTypeEnum);
        }
        return coffee;
    }
}
