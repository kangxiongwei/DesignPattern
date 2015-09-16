package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/16
 */
public class SouthFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}
