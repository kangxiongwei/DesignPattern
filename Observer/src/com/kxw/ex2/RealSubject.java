package com.kxw.ex2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author kangxiongwei 2015/9/15
 */
public class RealSubject extends Observable {

    private String name;

    public void setName(String name) {
        this.name = name;
        this.setChanged();
        this.notifyObservers();
    }
}
