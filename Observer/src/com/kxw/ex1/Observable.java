package com.kxw.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，维护一个集合，将所有观察者放入集合中
 * @author kangxiongwei 2015/9/15
 */
public abstract class Observable {

    protected List<Observer> observableList = new ArrayList<Observer>();

    public void registerObservable(Observer observer){
        this.observableList.add(observer);
    }

    public void deleteObservable(Observer observer){
        this.observableList.remove(observer);
    }

    abstract void change(Object[] objects);

}
