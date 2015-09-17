/**
 * @author kangxiongwei 2015/9/17
 */
public class Client {

    public static void main(String[] args){
        Class clazz = new Class();
        clazz.setId(1);
        clazz.setName("高二二班");

        Student student01 = new Student();
        student01.setId(1);
        student01.setName("张三");
        student01.setAge(23);
        student01.setClazz(clazz);

        Student student = new StudentPrototype().cloneObj(student01);
        System.out.println(student == student01);
        System.out.println(student.getClazz() == student01.getClazz());

    }

    private static void testDeepClone() {
        Class clazz = new Class();
        clazz.setId(1);
        clazz.setName("高二二班");

        Student student01 = new Student();
        student01.setId(1);
        student01.setName("张三");
        student01.setAge(23);
        student01.setClazz(clazz);

        Student student02 = (Student)student01.clone();
        System.out.println(student02.getClazz());
        System.out.println(student01.getClazz());
    }

    private static void testShadowClone() {
        Class clazz = new Class();
        clazz.setId(1);
        clazz.setName("高二二班");
        System.out.println(clazz);
        try {
            Class clazz02 = (Class)clazz.clone();
            clazz02.setName("高二一班");
            System.out.println(clazz02);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
