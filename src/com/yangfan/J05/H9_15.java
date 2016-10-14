package com.yangfan.J05;

/**
 * Created by YangFan on 2016/9/29.
 */
public class H9_15 {
    public static void main(String[] args){
        int count = 0;
        for (char item : args[0].toCharArray()) {
            if (item >= 'A' && item <= 'Z'){
                ++count;
            }
        }
        System.out.println("The count is " + count);
    }
}
