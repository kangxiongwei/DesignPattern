package com.kxw.ex1;

import com.sun.javafx.fxml.ObservableListChangeEvent;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Test {

    public static void main(String[] args) {
        //观察者
        Observer observer = new ConcreteObserver();
        //被观察者
        ConcreteObservable observable = new ConcreteObservable();
        //将观察者注册到被观察者列表中
        observable.registerObservable(observer);
        //改变被观察者，观察者能够感知
        observable.change(new Object[]{"abc","345"});

    }

}
