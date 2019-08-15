package Timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器：可以让我们在指定的时间做某件事情
 *          还可以重复的做某件事情
 *
 *   依赖Timer和TimerTask这两个类
 *      定时器类  任务类
 *
 *     Timer:定时
 *     public Timer()
 *     public void schedule(TimerTask task,long delay)：安排指定时间完成任务
 *     public void schedule(TimeTask task,long delay,long period)：安排指定时间完成任务连续执行
 *
 *     TimerTask:任务
 *
 */
public class TimerDemo2 {
    public static void main(String[] args) {
        //创建定时器对象
        Timer t = new Timer();
        //3秒后执行
        System.out.println("3秒后爆炸");
        //如果不成功，每两秒继续再炸
        //结束任务
        // t.schedule(new MyTask(),3000);
        t.schedule(new MyTask2(),3000,2000);
    }
}

//做一个任务
class MyTask2 extends TimerTask{
    private Timer t;

    public MyTask2(){}

    public MyTask2(Timer t){
        this.t = t;
    }
    @Override
    public void run() {
        System.out.println("Boom!!!");
        //t.cancel();
    }
}
