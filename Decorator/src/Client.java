/**
 * @author kangxiongwei 2015/9/17
 */
public class Client {

    public static void main(String[] args){
        Car car = new RunCar();
        Car flyCar = new FlyCarDecorator(car);
        flyCar.run();
        flyCar.stop();
    }

}
