package com.yangfan.J02;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by imqqy on 2016/9/7.
 */
public class T07 {
    public static void main(String[] args){
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a , b , c : ");
        QuadraticPolygon quadraticPolygon = new QuadraticPolygon(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
        if (quadraticPolygon.getDiscriminant() < 0 ){
            System.out.println("The equation has no roots");
        } else if (quadraticPolygon.getDiscriminant() == 0){
            System.out.println("Root = " + decimalFormat.format(quadraticPolygon.getRoot1()));
        } else if (quadraticPolygon.getDiscriminant() > 0) {
            System.out.println("Root1 = " + decimalFormat.format(quadraticPolygon.getRoot1()) + "\nRoot2 = " + decimalFormat.format(quadraticPolygon.getRoot2()));
        }
    }
}

class QuadraticPolygon{
    private double a;
    private double b;
    private double c;
    public QuadraticPolygon(double a , double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        if (getDiscriminant() < 0) return 0;
        return ((-b)+Math.sqrt(getDiscriminant())) / (2*a);
    }

    public double getRoot2(){
        if (getDiscriminant() < 0) return 0;
        return ((-b)-Math.sqrt(getDiscriminant())) / (2*a);
    }
}