package homework.J04;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by 鏉ㄥ竼 on 2016/9/21.
 */

//浣跨敤姣浣滀负璁￠噺鍗曚綅浼氶兘鍥犱负澶皬鍙樻垚0   鎵�互鍙栫撼绉掍綔涓鸿閲忓崟浣�
public class E6_16 {
    private static int arrayCount = 100000;
    public static void main(String[] args){

        long start = System.nanoTime();
        int[] intArray = new int[arrayCount];
        Random rand = new Random();
        int randIntNumber = rand.nextInt(100000);
        for (int i = 0 ; i < arrayCount ; i++){
            intArray[i] = rand.nextInt(100000);
        }
        long end = System.nanoTime();
        long Execution = end - start;
        System.out.println("The times of initialization is : " + Execution + "ns");

        //杈撳嚭椤哄簭鏌ユ壘鏃堕棿
        long startTime = System.nanoTime();
        LinearSearch(intArray,randIntNumber);
        long endTime = System.nanoTime();
        long ExecutionTime = endTime - startTime;
        System.out.println("The times of using LinearSearch() is : " + ExecutionTime + "ns");

        //杈撳嚭鎶樺崐鏌ユ壘鏃堕棿
        Arrays.sort(intArray);
        startTime = System.nanoTime();
        Arrays.binarySearch(intArray,randIntNumber);
        endTime = System.nanoTime();
        ExecutionTime = endTime - startTime;
        System.out.println("The times of using BinarySearch() is : " + ExecutionTime + "ns");

    }

    public static int LinearSearch(int[] list , int key){
        for (int i = 0 ; i < list.length ; i++){
            if (key == list[i])
                return i;
        }
        return -1;
    }

}
