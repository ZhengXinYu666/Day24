package Student;

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
                if (x % 2 == 0) {
                    s.name = "花木兰";
                    s.age = 27;
                } else {
                    s.name = "露娜";
                    s.age = 30;
                }
                x++;
            }
        }
    }
}
