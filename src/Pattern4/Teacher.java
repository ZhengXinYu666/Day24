package Pattern4;

/**
 * 饿汉式：类一加载就创建对象
 * 懒汉式：用的时候，才创建对象
 */
public class Teacher {
    private Teacher(){}


    private static Teacher t = null;

    public static Teacher getTeacher(){
        if(t == null){
            t = new Teacher();
        }
        return t;
    }
}
