package homework.J06;

import java.math.BigInteger;

/**
 * Created by YangFan on 2016/10/14.
 */
public class M14_15 {
    public static void main(String[] args){
        System.out.println("p   2^p-1");
        for (int p = 1 ; p <= 100 ; p++){
            BigInteger b = new BigInteger(new BigInteger("2").pow(p).subtract(BigInteger.ONE).toString());
            if (b.isProbablePrime(100)){
                System.out.println(p + "     " + b);
            }
        }
    }
}
