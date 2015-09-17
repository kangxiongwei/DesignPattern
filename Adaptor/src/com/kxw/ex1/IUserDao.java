package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/15
 */
public abstract class IUserDao implements IBaseDao {

    @Override
    public void add(Object object) {
        System.out.println("add");
    }

    @Override
    public void update(Object object) {
        System.out.println("update");
    }

    public abstract Object get(int id);

    public abstract void delete(Object object);

}
