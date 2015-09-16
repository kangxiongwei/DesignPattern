package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/15
 */
public class StaticProxy implements Action{

    private Action object;

    public StaticProxy(Action action){
        this.object = action;
    }

    @Override
    public void action() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        this.object.action();
    }
}
