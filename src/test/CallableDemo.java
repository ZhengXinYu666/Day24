package test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args)throws InterruptedException, ExecutionException {
        //创建线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(2);

        //可以执行Callable对象代表的线程
        Future<Integer> f1 = pool.submit(new MyCallable(100));
        Future<Integer> f2 = pool.submit(new MyCallable(200));

        Integer i1 = f1.get();
        Integer i2 = f2.get();

        System.out.println(i1);
        System.out.println(i2);


        //结束
        pool.shutdown();
    }
}
