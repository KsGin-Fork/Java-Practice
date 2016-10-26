package homework.J09;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by YangFan on 2016/10/26.
 */
public class C13_3 {
    public static void main(String[] args){
        int[] iArr = new int[100];
        Random rand = new Random();
        Scanner cin = new Scanner(System.in);
        for (int i = 0 ; i < 100 ; i++){
            iArr[i] = rand.nextInt();
        }
        System.out.print("Please input a integer index:");
        int index = cin.nextInt();
        try {
            System.out.println("The number of index "+ index +" this array is "+iArr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds!");
        }
    }
}
