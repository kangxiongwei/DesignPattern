package com.kxw.ex1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangxiongwei 2015/9/17
 */
public class CharacterFactory {

    private final static Map<String,MyCharacter> temp = new HashMap<String, MyCharacter>();

    public IMyCharacter getMyCharacter(String key){
        MyCharacter myCharacter = temp.get(key);
        if (myCharacter == null){
            myCharacter = new MyCharacter(key);
            temp.put(key,myCharacter);
        }
        return myCharacter;
    }

}
