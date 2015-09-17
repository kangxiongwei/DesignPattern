package com.kxw.ex3;

/**
 * @author kangxiongwei 2015/9/16
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void target() {
        this.adaptee.method();
    }
}
