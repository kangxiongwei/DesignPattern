package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/14
 */
public class Waiter {

    private Command command;

    public Waiter(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sail(){
        this.command.sail();
    }
}
