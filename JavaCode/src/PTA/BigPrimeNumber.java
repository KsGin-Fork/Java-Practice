package PTA;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * Created by KsGin on 2017/1/4.
 */
public class BigPrimeNumber {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println(new BigInteger(cin.next()).divide(new BigInteger(cin.next())));
        cin.close();
    }
}
