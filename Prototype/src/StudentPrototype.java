/**
 * @author kangxiongwei 2015/9/17
 */
public class StudentPrototype implements Prototype {

    /**
     * 通过一个对象，得到一份拷贝返回
     *
     * @param student
     * @return
     */
    @Override
    public Student cloneObj(Object student) {
        if (student instanceof Student){
            return ((Student)student).clone();
        }
        return null;
    }
}
