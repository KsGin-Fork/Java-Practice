package com.yangfan.J03;

/**
 * Created by 杨帆 on 2016/9/17.
 */
public class J10 {
    public static void main(String[] args){
        System.out.println(MyPoint.distance(new MyPoint(),new MyPoint(10,30.5)));
        System.out.println(MyPoint.distance(0,0,10,30.5));
    }
}

class MyPoint{
    private double x;

    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint(){
        this.x = 0 ;
        this.y = 0 ;
    }

    public MyPoint(double x , double y){
        this.x = x;
        this.y = y;
    }

    public static double distance(MyPoint point1 , MyPoint point2){
        return Math.sqrt(Math.pow(point2.getX() - point1.getX() , 2) + Math.pow(point2.getY() - point1.getY() , 2));
    }

    public static double distance(double x1 , double y1 , double x2 ,double y2){
        return Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2));
    }
}