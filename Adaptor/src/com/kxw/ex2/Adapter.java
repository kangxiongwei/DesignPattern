package com.kxw.ex2;

/**
 * 适配器，通过继承Adaptee来调用其中的方法
 * @author kangxiongwei 2015/9/16
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void method1() {
        this.method2();
    }
}
