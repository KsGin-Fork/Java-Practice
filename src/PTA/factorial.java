package PTA;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by YangFan on 2016/11/25.
 */
public class factorial {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger(cin.nextInt()+"");
        System.out.println(getFac(bigInteger));
    }

    public static BigInteger getFac(BigInteger number){
        if (number == BigInteger.ZERO) return BigInteger.ONE;
        if (number == BigInteger.ONE) return BigInteger.ONE;
        return number.multiply(getFac(number.subtract(BigInteger.ONE)));
    }
}
