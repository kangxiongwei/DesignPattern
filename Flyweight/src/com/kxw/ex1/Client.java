package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/17
 */
public class Client {

    private final static CharacterFactory factory = new CharacterFactory();

    public static void main(String[] args){
        String key = "a";
        IMyCharacter character = testFlyweight(key);
        IMyCharacter character1 = testFlyweight02(key);
        System.out.println(character == character1);
    }

    private static IMyCharacter testFlyweight(String key) {
        IMyCharacter temp = factory.getMyCharacter(key);
        return temp;
    }

    private static IMyCharacter testFlyweight02(String key) {
        IMyCharacter temp = factory.getMyCharacter(key);
        return temp;
    }

}
