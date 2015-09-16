package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Client {

    public static void main(String[] args){
        Action target = new Target();
        Action action = new StaticProxy(target);
        action.action();
    }

}
