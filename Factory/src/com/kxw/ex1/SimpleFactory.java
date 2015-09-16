package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/15
 */
public class SimpleFactory {

    public static Fruit getFruit(String type){
        if("apple".equals(type)){
            return new Apple();
        }
        else if("banana".equals(type)){
            return new Banana();
        }
        else {
            return null;
        }

    }


}
