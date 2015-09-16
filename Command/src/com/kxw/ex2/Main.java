package com.kxw.ex2;

/**
 * @author kangxiongwei 2015/9/14
 */
public class Main {

    public static void main(String[] args){

        Peddler peddler = new Peddler();

        Command appleCommand = new AppleCommand(peddler);
        Command bananaCommand = new BananaCommand(peddler);

        Waiter waiter = new Waiter();
        waiter.addCommands(appleCommand);
        waiter.addCommands(bananaCommand);
        waiter.sail();
        waiter.removeCommands(bananaCommand);
        waiter.sail();
    }

}
