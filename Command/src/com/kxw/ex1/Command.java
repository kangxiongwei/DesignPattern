package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/14
 */
public abstract class Command {

    protected Peddler peddler;

    public Command(Peddler peddler){
        this.peddler = peddler;
    }

    public void setPeddler(Peddler peddler) {
        this.peddler = peddler;
    }

    public abstract void sail();

}
