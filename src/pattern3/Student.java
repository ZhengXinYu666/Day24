package pattern3;

/**
 * 饿汉式---一一进来就早对象
 */
public class Student {
    //构造私有
    private Student(){}

    //自己造一个
    //静态方法只能访问静态成员变量,加静态
    //为了不让外接直接访问修改，加private
    private static Student s = new Student();

    //提供公共访问方式
    //为了保证外接能够直接使用该方法，加上static
    public static Student getStudent(){
        return s;
    }

}
