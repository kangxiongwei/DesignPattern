package com.kxw;

import com.kxw.ex1.Singleton01;
import com.kxw.ex2.Singleton02;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Client {

    public static void main(String[] args){
        Singleton01 singleton = Singleton01.getInstance();
        System.out.println(singleton);

        Singleton01 singleton1 = Singleton01.getInstance();
        System.out.println(singleton1);

        Singleton02 singleton2 = Singleton02.getInstance();
        System.out.println(singleton2);

        Singleton02 singleton3 = Singleton02.getInstance();
        System.out.println(singleton3);
    }

}
