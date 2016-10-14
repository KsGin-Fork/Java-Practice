package com.yangfan.J05;

import java.util.Random;

/**
 * Created by YangFan on 2016/9/29.
 */
public class H8_4 {
    public static void main(String[] args){
        Random random = new Random(1000);
        for (int i = 0 ; i < 50 ; i++){
            System.out.print(random.nextInt(100) + " ");
        }
    }
}
