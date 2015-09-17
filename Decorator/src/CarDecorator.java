/**
 * @author kangxiongwei 2015/9/17
 */
public abstract class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }
}
