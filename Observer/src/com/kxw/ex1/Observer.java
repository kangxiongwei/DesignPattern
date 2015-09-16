package com.kxw.ex1;

/**
 * 观察者接口
 * @author kangxiongwei 2015/9/15
 */
public interface Observer {

    void update(Observable observable, Object[] args);

}
