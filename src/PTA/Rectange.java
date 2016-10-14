package PTA;

import java.util.Scanner;

class Rectangule1 {
    private double width = 1;
    private double height = 1;

    public Rectangule1(){

    }

    public Rectangule1(double width , double height){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return width * height;
    }
    public double getPremi() {
        return (width + height) *2;
    }
}

public class Rectange{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Rectangule1 rectangule = new Rectangule1(width , height);
        System.out.println(rectangule.getArea());
        System.out.println(rectangule.getPremi());
    }
}

