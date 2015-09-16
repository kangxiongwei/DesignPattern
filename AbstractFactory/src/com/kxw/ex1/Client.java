package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/16
 */
public class Client {

    public static void main(String[] args){
        Fruit apple = new NorthFactory().getApple();
        apple.say();
    }

}
