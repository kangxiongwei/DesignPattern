/**
 * @author kangxiongwei 2015/9/17
 */
public class RunCar implements Car {

    @Override
    public void run() {
        System.out.println("I can run");
    }

    @Override
    public void stop() {
        System.out.println("I can stop");
    }
}
