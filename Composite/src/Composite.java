import java.util.ArrayList;
import java.util.List;

/**
 * @author kangxiongwei 2015/9/16
 */
public class Composite implements Component{

    private List<Component> componentList = new ArrayList<Component>();

    public void add(Component component){
        this.componentList.add(component);
    }

    public void remove(Component component){
        this.componentList.remove(component);
    }

    @Override
    public void doSomething() {
        for(Component component: componentList){
            component.doSomething();
        }
    }
}
