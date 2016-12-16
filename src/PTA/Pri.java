package PTA;

/**
 * Created by KsGin on 12/16/2016.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Pri {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner cin = new Scanner(System.in);
        String n = cin.next();
        int m = cin.nextInt();
        BigInteger newbig = new BigInteger(n);
        for(int i = 0 ; i < m ;i++){
            System.out.println(newbig = newbig.nextProbablePrime());
        }
    }
}