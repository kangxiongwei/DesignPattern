package com.kxw.ex1;

/**
 * 适配器接口
 * @author kangxiongwei 2015/9/15
 */
public interface IBaseDao {

    void add(Object object);

    void delete(Object object);

    void update(Object object);

    Object get(int id);


}
