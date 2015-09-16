package com.kxw.ex2;

/**
 * @author kangxiongwei 2015/9/14
 */
public class BananaCommand extends Command {

    public BananaCommand(Peddler peddler) {
        super(peddler);
    }

    @Override
    public void sail() {
        this.peddler.sailBanana();
    }
}
