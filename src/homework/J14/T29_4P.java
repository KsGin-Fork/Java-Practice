package homework.J14;

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

        //鏃犻檺寰幆鍒ゆ柇1000涓嚎绋嬫槸鍚﹀叏閮ㄧ粨鏉熶换鍔″叧闂�        
        while (true){
            if (executorService.isTerminated()){
                System.out.println(sum.getSum());
                break;
            }
        }
    }

}

//鍖呰
class Integer{
    private int sum;

    Integer(int sum) {
        this.sum = sum;
    }

    //閿佸悓姝�    
    public synchronized void PlusSum(){
        ++sum;
    }

    public int getSum(){
        return sum;
    }

}