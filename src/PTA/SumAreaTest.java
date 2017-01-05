package PTA;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by KsGin on 2017/1/5.
 */
public class SumAreaTest {
    public static double sumArea(Shape[] a){
        double sumArea = 0d;
        for (Shape s : a ) {
            sumArea += s.getArea();
        }
        return sumArea;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        double r1 = cin.nextDouble();
        double r2 = cin.nextDouble();
        double w1 = cin.nextDouble();
        double h1 = cin.nextDouble();
        double w2 = cin.nextDouble();
        double h2 = cin.nextDouble();
        System.out.println("The total area is " + new DecimalFormat("0.0000").format(
                sumArea(new Shape[]{new Circle(r1) , new Circle(r2) , new Rectangle(w1 , h1 ) , new Rectangle(w2 , h2)})));
    }
}



abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Circle extends Shape{

    private double radius = 1;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape{

    private double width = 1;
    private double height = 1;

    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * ( width + height ) ;
    }
}