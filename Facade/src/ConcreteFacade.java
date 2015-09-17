import java.util.ArrayList;
import java.util.List;

/**
 * @author kangxiongwei 2015/9/17
 */
public class ConcreteFacade implements Facade {

    Facade house = new House();
    Facade person = new Person();

    @Override
    public void doSomething() {
        house.doSomething();
        person.doSomething();
    }
}
