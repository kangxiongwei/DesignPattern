/**
 * @author kangxiongwei 2015/9/17
 */
public class Student implements Cloneable {

    private int id;
    private String name;
    private int age;
    private Class clazz;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    /*@Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", clazz=" + clazz +
                '}';
    }*/

    @Override
    public Student clone() {
        try {
            Student student = (Student)super.clone();
            Class cla = (Class)this.getClazz().clone();
            student.setClazz(cla);
            return student;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
