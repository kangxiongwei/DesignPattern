/**
 * 父类定义步骤
 * @author kangxiongwei 2015/9/16
 */
public abstract class AbstractClass {

    public abstract void method1();
    public abstract void method2();
    public abstract void method3();

    protected void template(){
        this.method1();
        this.method2();
        this.method3();
    }

}
