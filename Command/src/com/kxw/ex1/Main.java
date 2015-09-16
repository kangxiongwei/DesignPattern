package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/14
 */
public class Main {

    public static void main(String[] args){

        Peddler peddler = new Peddler();

        Command appleCommand = new AppleCommand(peddler);
        Command bananaCommand = new BananaCommand(peddler);

        Waiter waiter = new Waiter(appleCommand);
        waiter.sail();

        waiter.setCommand(bananaCommand);
        waiter.sail();
    }

}
