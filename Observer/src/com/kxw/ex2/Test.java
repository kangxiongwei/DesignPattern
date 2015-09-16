package com.kxw.ex2;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Test {

    public static void main(String[] args){
        RealSubject realSubject = new RealSubject();
        MyObserver observer = new MyObserver();
        realSubject.addObserver(observer);
        realSubject.setName("张三");
    }

}
