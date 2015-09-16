package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/16
 */
public class NorthFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
