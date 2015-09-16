package com.kxw.ex2;

import com.kxw.ex1.Fruit;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Test {

    public static void main(String[] args){
        FruitFactory factory = new AppleFactory();
        Fruit fruit = factory.getFruit();
        fruit.print();
    }

}
