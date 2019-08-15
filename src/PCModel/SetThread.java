package PCModel;

import PCModel.Student;

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
                if (x % 2 == 0) {
                    s.set("花木兰",27);
                } else {
                    s.set("露娜",25);
                }
                x++;
            }
        }
    }
