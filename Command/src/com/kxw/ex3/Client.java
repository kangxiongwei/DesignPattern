package com.kxw.ex3;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Client {

    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.invoke();
    }

}
