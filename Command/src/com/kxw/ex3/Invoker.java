package com.kxw.ex3;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void invoke(){
        this.command.execute();
    }

}
