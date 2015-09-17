package com.kxw.ex1;

/**
 * @author kangxiongwei 2015/9/15
 */
public class UserDao extends IUserDao {

    @Override
    public void delete(Object object) {
        System.out.println("delete");
    }

    @Override
    public Object get(int id) {
        System.out.println("get");
        return null;
    }
}
