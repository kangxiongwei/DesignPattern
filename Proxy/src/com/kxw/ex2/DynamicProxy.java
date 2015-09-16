package com.kxw.ex2;

import com.kxw.ex1.Action;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * @author kangxiongwei 2015/9/15
 */
public class DynamicProxy implements InvocationHandler{
    
    private Action target;
    
    public DynamicProxy(Action target){
        this.target = target;
    }

    public Object getProxy(){
        ClassLoader classLoader = this.target.getClass().getClassLoader();
        Class[] clazz = this.target.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, clazz, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        Object object = method.invoke(this.target, args);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        return object;
    }
}
