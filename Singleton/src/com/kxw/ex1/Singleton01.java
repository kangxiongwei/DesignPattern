package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Singleton01 {

    private static Singleton01 singleton = new Singleton01();

    private Singleton01(){}

    public static Singleton01 getInstance(){
        return singleton;
    }
}
