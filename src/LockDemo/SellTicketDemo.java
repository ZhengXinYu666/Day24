package LockDemo;

/**
 *
 * Lock
 *      void lock()：获取锁
 *      void unlock()：释放锁
 *
 *      ReentrantLock()
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        //创建资源对象
        Sellticket st = new Sellticket();

        //创建三个窗口
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
