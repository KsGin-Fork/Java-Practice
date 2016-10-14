package com.yangfan.J05;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by YangFan on 2016/9/29.
 */
public class H9_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input two string");
        System.out.println( (isAnagram(sc.nextLine() , sc.nextLine()) ? "" : "No ") + "Anagram" );
    }

    public static boolean isAnagram(String s1 , String s2){
        if (s1.length() != s2.length()) return false;
        char[] buf1 = s1.toCharArray() , buf2 = s2.toCharArray();
        Arrays.sort(buf1);
        Arrays.sort(buf2);
        for (int i = 0 ; i < buf1.length ; i++){
            if (buf1[i] != buf2[i]) return false;
        }
        return true;
    }
}
