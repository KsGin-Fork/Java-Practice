package Error;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by 杨帆 on 2016/9/21.
 */


public class E {
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