/**
 * @author kangxiongwei 2015/9/17
 */
public class FlyCarDecorator extends CarDecorator {

    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        System.out.println("I can fly");
        this.car.run();
    }

    @Override
    public void stop() {
        System.out.println("I can fly");
        this.car.stop();
    }
}
