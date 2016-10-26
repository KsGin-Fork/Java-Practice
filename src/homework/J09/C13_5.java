package homework.J09;

import homework.J08.GeometricObject;

/**
 * Created by YangFan on 2016/10/26.
 */
public class C13_5 {
    public static void main(String[] args){
        new Triangle(-2 , 2 , 6);
    }
}

class IllegalTriangleException extends RuntimeException{
    public String getRet() {
        return ret;
    }

    public String getMsg() {
        return msg;
    }

    private String ret , msg;
    public IllegalTriangleException(){
        super();
    }
    public IllegalTriangleException(String msg){
        super(msg);
        this.msg = msg;
    }
    public IllegalTriangleException(String ret , String msg){
        super();
        this.ret = ret;
        this.msg = msg;
    }
}

class Triangle extends GeometricObject {
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
    public Triangle(){}
    public Triangle(double side1 ,double side2 ,double side3) throws IllegalTriangleException{
        if (side1+side2 < side3 || side1 + side3 < side2 || side2+side3<side1) throw new IllegalTriangleException("error");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1 ,double side2 ,double side3,String color , boolean filled){
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea(){
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString(){
        return "Triangle side1 = " + side1 + ", side2 = "+side2 +", side3 = "+side3;
    }
}