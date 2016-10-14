package com.yangfan.J06;

import java.math.BigInteger;

/**
 * Created by YangFan on 2016/10/13.
 */
public class M14_14 {
    public static void main(String[] args){
        BigInteger number = new BigInteger("" + Long.MAX_VALUE).add(BigInteger.ONE);
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(number = number.nextProbablePrime());
        }
    }
}
