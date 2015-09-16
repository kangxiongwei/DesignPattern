package com.kxw.ex2;

import com.kxw.ex1.Action;
import com.kxw.ex1.Target;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Client {

    public static void main(String[] args){
        Action target = new Target();
        DynamicProxy proxy = new DynamicProxy(target);
        Action action = (Action)proxy.getProxy();
        action.action();
    }

}
