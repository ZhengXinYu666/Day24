package pattern3;

/**
 * 单例模式：保证类在内存中只有一个对象
 *
 * 如何保证类在内存中只有一个对象呢？
 *      1、把构造方法私有
 *      2、在成员位置，自己创建一个对象
 *      3、通过一个公共的方法提供访问
 */
public class StudentDemo {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student s2 = new Student();
//        System.out.println(s1 == s2);//false

        //通过单例如何得到对象呢？
        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
        System.out.println(s1 == s2);
    }
}
