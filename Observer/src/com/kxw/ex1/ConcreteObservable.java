package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/15
 */
public class ConcreteObservable extends Observable {

    @Override
    public void change(Object[] args) {
        for (Observer observer: this.observableList){
            observer.update(this,args);
        }
    }
}
