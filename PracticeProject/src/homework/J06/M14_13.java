package homework.J06;

import java.math.BigInteger;

/**
 * Created by YangFan on 2016/10/14.
 */
public class M14_13 {
    public static void main(String[] args){
        long number = (long)Math.sqrt(Long.MAX_VALUE);
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(new BigInteger(number++ +"").pow(2));
        }
    }
}
