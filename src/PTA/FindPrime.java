package PTA;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by YangFan on 2016/11/8.
 */
public class FindPrime {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        BigInteger b1 = new BigInteger(cin.next());
        int b2 = cin.nextInt();
        for (;b2>0;b1 = b1.add(BigInteger.ONE)){
            if (b1.isProbablePrime(100)) {
                System.out.println(b1);
                --b2;
            }
        }
    }
}
