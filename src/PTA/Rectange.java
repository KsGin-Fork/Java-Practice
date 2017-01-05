package PTA;

import java.util.Scanner;

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

