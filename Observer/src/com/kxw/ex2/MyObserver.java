package com.kxw.ex2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author kangxiongwei 2015/9/15
 */
public class MyObserver implements Observer {

    @Override
    public void update(Observable observable, Object arg) {
        System.out.println("对象发生了改变");
    }
}
