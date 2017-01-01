package homework.J14;

/**
 * Created by KsGin on 12/22/2016.
 */
class T29_4T implements Runnable{
    public static void main(String[] args) {
        new T29_4T();
    }
    //鍦ㄨ嚜宸辩殑鏋勯�鍑芥暟涓皟鐢ㄨ嚜宸辩殑鏋勯�鏂规硶   鏃犺剳閫掑綊寮�柊绾跨▼
    public T29_4T() {
        //T29_4T task = new T29_4T();       //娉ㄩ噴鎺�        
    	new Thread(this).start();     //浣跨敤this鎸囬拡
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
        //t.start();              //绾跨▼宸茬粡澶勪簬闈炲垱寤虹姸鎬�    
        }
    public void run() {
        System.out.println("test");
    }
}
