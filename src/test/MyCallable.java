package test;

import java.util.concurrent.Callable;

/**
 * 编写一个线程求和案例
 *
 */
public class MyCallable implements Callable {

    private int number;

    public MyCallable(int number){
        this.number = number;
    }

    @Override
    public Object call() throws Exception {

        int sum = 0;
        for(int x=1;x<=number;x++){
            sum += x;
        }
        return sum;
    }
}
