package com.kxw.ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author kangxiongwei 2015/9/17
 */
public class PersonMenu implements Menu {

    private String dish ;
    //在构造方法中给内蕴状态附值
    public PersonMenu(String dish){
        this.dish = dish ;
    }


    @Override
    public void setPersonMenu(String person, List list) {
        list.add(person);
        list.add(dish);
    }

    @Override
    public List findPersonMenu(String person, List list) {
        List dishList = new ArrayList();
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            if(person.equals((String)it.next()))
                dishList.add(it.next());
        }
        return dishList ;
    }
}
