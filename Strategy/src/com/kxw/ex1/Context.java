package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/15
 */
public class Context implements Strategy{

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    @Override
    public void strategy() {
        this.strategy.strategy();
    }
}
