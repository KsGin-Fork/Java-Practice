package com.yangfan.J04;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by 杨帆 on 2016/9/21.
 */

//使用毫秒作为计量单位会都因为太小变成0   所以取纳秒作为计量单位
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

        //输出顺序查找时间
        long startTime = System.nanoTime();
        LinearSearch(intArray,randIntNumber);
        long endTime = System.nanoTime();
        long ExecutionTime = endTime - startTime;
        System.out.println("The times of using LinearSearch() is : " + ExecutionTime + "ns");

        //输出折半查找时间
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
