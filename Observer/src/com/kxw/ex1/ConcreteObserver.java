package com.kxw.ex1;

/**
 * 具体的观察者
 * @author kangxiongwei 2015/9/15
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable observable, Object[] args) {
        System.out.println(observable + "发生了改变");
        System.out.println("参数为："+args);
    }
}
