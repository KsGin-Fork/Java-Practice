package PTA;

import java.util.Scanner;

class Rectangle {
    private double width = 1;
    private double height = 1;

    public Rectangle(){

    }

    public Rectangle(double width , double height){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return width * height;
    }
    public double getPerimeter() {
        return (width + height) *2;
    }
}

public class Rectange{

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

        double w = input.nextDouble();
        double h = input.nextDouble();
        Rectangle myRectangle = new Rectangle(w, h);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());

        input.close();

    }
}

