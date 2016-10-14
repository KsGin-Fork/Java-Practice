package com.yangfan.J06;

import java.util.Scanner;

/**
 * Created by YangFan on 2016/10/13.
 */
public class M9_18 {
    public static void main(String[] args){
        Show();
    }

    public static void Show(){
        double score = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String textStream = scanner.nextLine();
        String[] buffers = textStream.split(" ");
        for (String buf : buffers){
            try {
                score += Integer.parseInt(buf);
                count++;
            }
            catch (Exception e){
                continue;
            }

        }
        System.out.println("The sum of socre is " + score + ", the area is : " + score/count);
    }
}
