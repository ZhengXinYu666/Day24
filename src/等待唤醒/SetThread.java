package 等待唤醒;

/**
 * 生产者
 */
public class SetThread implements Runnable{
    private Student s;
    private int x = 0;
    public SetThread(Student s){
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                //判断有没有
                if(s.flag){
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (x % 2 == 0) {
                    s.name = "花木兰";
                    s.age = 27;
                } else {
                    s.name = "露娜";
                    s.age = 30;
                }
                x++;


                //修改标记
                s.flag = true;
                //唤醒线程
                s.notify();

            }
        }
    }
}
