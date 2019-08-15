package Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程的第三种实现方式
 */
public class CallableDemo {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(2);

        //可以执行Callable对象代表的线程
        pool.submit(new MyCallable());
        pool.submit(new MyCallable());

        pool.shutdown();
    }
}
