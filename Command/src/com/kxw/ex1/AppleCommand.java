package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/14
 */
public class AppleCommand extends Command {

    public AppleCommand(Peddler peddler) {
        super(peddler);
    }

    @Override
    public void sail() {
        this.peddler.sailApple();
    }
}
