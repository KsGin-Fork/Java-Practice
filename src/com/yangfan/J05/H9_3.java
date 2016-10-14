package com.yangfan.J05;

import java.util.Scanner;

/**
 * Created by YangFan on 2016/9/29.
 */
public class H9_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the password:");
        System.out.println((checkPassword(sc.nextLine()) ? "Valid" : "Invalid" ) + " Password");
    }

    public static boolean checkPassword(String s){
        int iCount = 0 ;
        if (s.length() < 8) return false;
        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') ++iCount;
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z');
            else return false;
        }
        if (iCount < 2) return false;
        return true;
    }
}
