package com.kxw.ex2;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Singleton02 {

    private static Singleton02 singleton = null;

    private Singleton02(){}

    public static Singleton02 getInstance(){
        if(singleton == null){
            singleton = new Singleton02();
        }
        return singleton;
    }
}
