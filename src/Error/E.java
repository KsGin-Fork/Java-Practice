package Error;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by 杨帆 on 2016/9/21.
 */


import java.util.Scanner;

class Circle{
    double radius;

    public Circle(){

    }

    public Circle(double radius) {
        // TODO 自动生成的构造函数存根
        this.radius=radius;
    }

    public  double getradius(){
        return radius;
    }

    public double getArea(){
        return 3.14*getradius()*getradius();
    }

}
class GeometricObject1 extends Circle implements Comparable{
    public GeometricObject1(double radius) {
        // TODO 自动生成的构造函数存根
        super(radius);
    }

    public int compareTo(Object o) {
        // TODO 自动生成的方法存根
        if (getArea()>((GeometricObject1) o).getArea())
            return 1;
        else
            return -1;
    }

    public boolean equals(Object c){
        if (this.radius == ((GeometricObject1)c).radius)
            return true;
        else
            return false;
    }

}
public class E{

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        Scanner input=new Scanner(System.in);
        double radius1=input.nextDouble();
        double radius2=input.nextDouble();
        GeometricObject1 circle1=new  GeometricObject1(radius1);
        GeometricObject1 circle2=new  GeometricObject1(radius2);
        System.out.println(circle1.equals(circle2));
    }


}