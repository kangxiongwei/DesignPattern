import javax.smartcardio.CommandAPDU;

/**
 * @author kangxiongwei 2015/9/16
 */
public class Client {

    public static void main(String[] args){
        Composite composite = new Composite();

        Component component1 = new Leaf();
        Component component2 = new Leaf();

        composite.add(component1);
        composite.add(component2);

        Component component3 = new Leaf();
        Component component4 = new Leaf();
        Composite com = new Composite();
        com.add(component3);
        com.add(component4);

        composite.add(com);

        composite.doSomething();
    }


}
