package homework.J05;

import java.util.Scanner;

/**
 * Created by YangFan on 2016/9/29.
 */
public class H9_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a buffer:");
        System.out.println("After sort string: " + sort(sc.nextLine()));
    }
    public static String sort(String s){
        char[] tBuf = s.toCharArray();
        for (int i = 0 ; i < tBuf.length ; i++){
            for (int j = 0 ; j < tBuf.length - i - 1 ; j++){
                if (tBuf[j] > tBuf[j+1]){
                    char t = tBuf[j];
                    tBuf[j] = tBuf[j+1];
                    tBuf[j+1] = t;
                }
            }
        }
        return new String(tBuf);
    }
}
