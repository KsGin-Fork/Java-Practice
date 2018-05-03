package homework.J06;

import java.math.BigInteger;

/**
 * Created by YangFan on 2016/10/13.
 */
public class M14_11 {
    public static void main(String[] args){
        String MaxLong = "" + Long.MAX_VALUE;
        int count = 0;
        for (BigInteger i = new BigInteger(MaxLong).add(BigInteger.ONE); count < 10 ; i = i.add(BigInteger.ONE)){
            if (i.remainder(new BigInteger("5")).equals(BigInteger.ZERO) || i.remainder(new BigInteger("6")).equals(BigInteger.ZERO)){
                System.out.println(i);
                count++;
            }
        }
    }
}
