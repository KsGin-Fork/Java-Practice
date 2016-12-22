package homework.J14;

import javax.sound.midi.Soundbank;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by KsGin on 12/22/2016.
 */
public class T29_4P {
    public static void main(String[] args){
        Integer sum = new Integer(0);

        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        for (int i = 0 ; i < 1000 ; ++i){
            executorService.execute(new Thread(() -> sum.PlusSum()));
        }
        executorService.shutdown();

        //无限循环判断1000个线程是否全部结束任务关闭
        while (true){
            if (executorService.isTerminated()){
                System.out.println(sum.getSum());
                break;
            }
        }
    }

}

//包装
class Integer{
    private int sum;

    Integer(int sum) {
        this.sum = sum;
    }

    //锁同步
    public synchronized void PlusSum(){
        ++sum;
    }

    public int getSum(){
        return sum;
    }

}