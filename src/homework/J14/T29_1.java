package homework.J14;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/**
 * Created by KsGin on 12/22/2016.
 */
//没有找到程序清单21.9
public class T29_1 {
    public static void main(String[] args){
        Executor threads = Executors.newFixedThreadPool(3);
        threads.execute(new Thread(() -> {
            for (int i = 0 ; i < 1000 ; ++i){
                System.out.print("A");
            }
        }));
        threads.execute(new Thread(() -> {
            for (int i = 0 ; i < 1000 ; ++i){
                System.out.print("B");
            }
        }));
        threads.execute(new Thread(() -> {
            for (int i = 0 ; i < 1000 ; ++i){
                System.out.print(i);
            }
        }));

    }
}
