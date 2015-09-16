package com.kxw.ex2;

import com.kxw.ex1.Banana;
import com.kxw.ex1.Fruit;

/**
 * @author kangxiongwei 2015/9/15
 */
public class BananaFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
