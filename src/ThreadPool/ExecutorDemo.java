package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池的好处：
 *      每一个线程代码结束后，并不会死亡，而是再次回到线程池中称为空闲状态，等待下一个对象来使用
 *
 *  如何实现？
 *      1、创建一个线程池对象，需要创建几个线程对象
 *      2、这种线程池的线程可以执行Runnable对象或者Callable代表的线程
 *      做一个类实现Runnable
 *      3、调用如下方法即可
 *          Future<?> submit(Runnable task)
 *          <T>Future<T> submit(Callable<T> task)
 *      4、结束线程池
 *          shutdown()
 *
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        //创建一个线程池对象，控制要创建几个线程对象
        //public static ExecutorService newFixedThreadPool(int nThreads)
        ExecutorService pool = Executors.newFixedThreadPool(2);

        //可以执行Runnabe对象或者Callable对象代表的线程
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

        //结束线程池
        pool.shutdown();
    }
}
