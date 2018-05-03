package PTA;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger(cin.nextInt()+"");
        System.out.println(getFac(bigInteger));
        cin.close();
    }

    public static BigInteger getFac(BigInteger number){
        if (number == BigInteger.ZERO) return BigInteger.ZERO;
        if (number == BigInteger.ONE) return BigInteger.ONE;
        return number.multiply(getFac(number.subtract(BigInteger.ONE)));
    }
}
