package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/17
 */
public class MyCharacter implements IMyCharacter {

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public MyCharacter(String info) {
        this.info = info;
    }

    @Override
    public void show() {
        System.out.println(this.getInfo());
    }
}
