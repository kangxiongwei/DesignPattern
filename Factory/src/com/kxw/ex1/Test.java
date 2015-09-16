package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Test {

    public static void main(String[] args){
        Fruit fruit = SimpleFactory.getFruit("banana");
        fruit.print();
    }

}
