package com.yangfan.J06;

import java.math.BigDecimal;

/**
 * Created by YangFan on 2016/10/13.
 */
public class M14_16 {
    public static void main(String[] args){
        System.out.println(getSum(new BigDecimal("100")));
    }

    public static BigDecimal getSum(BigDecimal number){
        BigDecimal bd = BigDecimal.ZERO;
        while (!number.equals(BigDecimal.ZERO)) {
            bd = bd.add(BigDecimal.ONE.divide(getFactorial(number), 25, BigDecimal.ROUND_HALF_UP));
            number = number.subtract(BigDecimal.ONE);
        }
        return bd.add(BigDecimal.ONE);
    }

    public static BigDecimal getFactorial(BigDecimal number){
        BigDecimal bd = BigDecimal.ONE;
        while (!number.equals(BigDecimal.ONE)){
            bd = bd.multiply(number);
            number = number.subtract(BigDecimal.ONE);
        }
        return bd;
    }
}
