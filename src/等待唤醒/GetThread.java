package 等待唤醒;

/**
 * 消费者
 */
public class GetThread implements Runnable {
    private Student s;

    public GetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                if(!s.flag){
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(s.name + "---" + s.age);

                //修改标记
                s.flag = false;
                //唤醒线程
                s.notify();
            }
        }
    }
}
