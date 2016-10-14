package com.yangfan.J05;

import java.util.Date;

/**
 * Created by YangFan on 2016/9/29.
 */
public class H8_3 {
    public static void main(String[] args){
        Date date = new Date();
        for (int i = 4 ; i <= 11 ; i++){
            date.setTime( (long)Math.pow(10 , i));
            System.out.println(date.toString());
        }
    }
}
