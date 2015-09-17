/**
 * @author kangxiongwei 2015/9/17
 */
public class Class implements Cloneable {

    private int id;
    private String name;

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

    /*@Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }*/

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
