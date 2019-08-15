package ThreadDemo;

/**
 * 匿名内部类：
 *      new 类名或者接口名(){
 *          重写方法;
 *      };
 *      本质：是该类或者接口的子类对象
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //继承Thread类来实现多线程
        new Thread(){
            @Override
            public void run() {
                for(int x = 0; x<100;x++){
                    System.out.println(Thread.currentThread().getName()+"---"+x);
                }
            }
        }.start();


        //实现Runable接口来实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int x = 0; x<100;x++){
                    System.out.println(Thread.currentThread().getName()+"---"+x);
                }
            }
        }){}.start();


        //更有难度的
        //走的Runable子类对象的run方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int x = 0; x<100;x++){
                    System.out.println("hello"+"---"+x);
                }
            }
        }){
            @Override
            public void run() {
                for(int x = 0; x<100;x++) {
                    System.out.println("world" + "---" + x);
                }
            }
        }.start();
    }
}
