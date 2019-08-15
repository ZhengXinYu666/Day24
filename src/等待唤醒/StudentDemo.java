package 等待唤醒;

/**
 * 分析：
 *      资源类：Student
 *      设置学生数据：SetThread（生产者）
 *      获取学生数据：Getthread（消费者）
 *      测试类：StudentDemo
 *
 * 问题1：按照思路写代码，发现数据每次都是null---0
 *  原因：我们在每个线程中都创建了新的资源，而我们要求的是
 *  设置和获取线程的资源应该是同一个
 *
 *  实现：在外界把这个数据创建出来，通过构造方法传递给其他的类
 *
 *
 * /**
 *  * 等待唤醒：
 *  *      Object类中提供了三个方法
 *  *      wait()：等待
 *  *      notify()：唤醒单个线程
 *  *      notifyAll()：唤醒所有进程
 *  *
 *  *      为什么不定义在Thread中呢？
 *  *          这些方法的调用，必须通过锁对象调用，而我们刚才使用的锁对象是任意锁对象
 *  *          所以这些方法必须定义在Object类中
 *  */
public class StudentDemo {
    public static void main(String[] args) {
        //创建资源
        Student s = new Student();

        //设置和获取的类
        SetThread st = new SetThread(s);
        GetThread gt = new GetThread(s);

        //线程类
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(gt);

        //启动线程
        t1.start();
        t2.start();
    }
}
