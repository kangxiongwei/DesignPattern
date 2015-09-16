package com.kxw.ex2;

import com.kxw.ex1.Apple;
import com.kxw.ex1.Fruit;

/**
 * @author kangxiongwei 2015/9/15
 */
public class AppleFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
