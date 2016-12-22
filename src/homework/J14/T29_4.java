package homework.J14;

/**
 * Created by KsGin on 12/22/2016.
 */
class T29_4T implements Runnable{
    public static void main(String[] args) {
        new T29_4T();
    }
    //在自己的构造函数中调用自己的构造方法   无脑递归开新线程
    public T29_4T() {
        //T29_4T task = new T29_4T();       //注释掉
        new Thread(this).start();     //使用this指针
    }
    public void run() {
        System.out.println("test");
    }
}



public class T29_4 implements Runnable {
    public static void main(String[] args) {
        new T29_4();
    }
    public T29_4() {
        Thread t = new Thread(this);
        t.start();
        //t.start();              //线程已经处于非创建状态
    }
    public void run() {
        System.out.println("test");
    }
}
