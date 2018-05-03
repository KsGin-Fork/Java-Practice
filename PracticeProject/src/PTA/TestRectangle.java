package PTA;



import java.util.Scanner;
import java.text.DecimalFormat;

interface IShape {
    double getArea();

    double getPerimeter();
}

class  RTriangle implements IShape{
    private double aSide;
    private double bSide;
    RTriangle(double a, double b){
        aSide = a;
        bSide = b;
    }

    @Override
    public double getArea() {
        return aSide*bSide/2;
    }

    @Override
    public double getPerimeter() {
        return aSide + bSide + Math.sqrt(aSide * aSide + bSide * bSide);
    }
}

public class TestRectangle {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        IShape r = new RTriangle(a, b);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
    }
}
