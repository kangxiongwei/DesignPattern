package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Client {

    public static void  main(String[] args){

        Strategy strategy = new AppleStrategy();
        Context context = new Context(strategy);
        context.strategy();

    }

}
