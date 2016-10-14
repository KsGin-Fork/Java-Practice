package com.yangfan.J01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by imqqy on 2016/9/3.
 */
public class T02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for a triangle : ");
        float FirstPointsX = scanner.nextFloat();
        float FirstPointsY = scanner.nextFloat();
        float SecondPointsX = scanner.nextFloat();
        float SecondPointsY = scanner.nextFloat();
        float ThirdPointsX = scanner.nextFloat();
        float ThirdPointsY = scanner.nextFloat();

        double side1 = Math.sqrt(Math.pow((SecondPointsX - FirstPointsX),2) + Math.pow((SecondPointsY - FirstPointsY),2));
        double side2 = Math.sqrt(Math.pow((ThirdPointsX - SecondPointsX),2) + Math.pow((ThirdPointsY - SecondPointsY),2));
        double side3 = Math.sqrt(Math.pow((FirstPointsX - ThirdPointsX),2) + Math.pow((FirstPointsY - ThirdPointsY),2));


        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        DecimalFormat decimalFormat = new DecimalFormat("#0.00#");

        System.out.println("The area of the triangle is " + decimalFormat.format(area));

    }

}
