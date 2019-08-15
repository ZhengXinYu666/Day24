package ThreadGroup;

/**
 * 线程组：把多个线程组合到一起
 * 对多个线程进行分类管理，可以直接对线程组惊醒控制
 *
 */
public class ThreadGroupDemo {
    public static void main(String[] args) {
        //method1();
        method2();

    }


    public static void method1() {
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my, "花木兰");
        Thread t2 = new Thread(my, "公孙离");
        //不知道他们属于哪个线程组，我想知道，怎么办？
        //线程类中的方法
        ThreadGroup tg1 = t1.getThreadGroup();
        ThreadGroup tg2 = t2.getThreadGroup();

        //线程组中的方法
        String name1 = tg1.getName();
        String name2 = tg2.getName();
        System.out.println(name1);
        System.out.println(name2);
        //通过结果知道了，线程默认情况下属于main线程组

        //通过下面的测试，知道了默认情况下，所有的线程都属于同一个组
        System.out.println(Thread.currentThread().getThreadGroup().getName());

        //我们如何修改线程所在的组呢
        //创建一个线程组
        //创建其他线程的时候，把其他线程的组指定为我们新建的线程组


//        t1.start();
//        t2.start();
    }


    public static void method2() {
        ThreadGroup tg = new ThreadGroup("这是一个新的组");
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(tg, my, "花木兰");
        Thread t2 = new Thread(tg, my, "公孙离");

        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());

        tg.setDaemon(true);//说明该组的线程都是后台线程/守护线程
    }
}