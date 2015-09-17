package com.kxw.ex2;

import java.util.List;

/**
 * @author kangxiongwei 2015/9/17
 */
public interface Menu {

    void setPersonMenu(String person,List list);

    List findPersonMenu(String person,List list);

}
