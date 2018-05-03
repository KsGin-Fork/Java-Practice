package homework.J08;

/**
 * Created by YangFan on 2016/10/23.
 */
public class M14_5 {
    public static void main(String[] args){
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(10);
        System.out.println(c1.equals(c2));
    }
}

class Circle extends GeometricObject implements Comparable{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return  Math.PI*Math.pow(this.radius,2);
    }
    @Override
    public int compareTo(Object o) {
        return this.getArea() >= ((Circle) o).getArea() ? 1 : -1;
    }
    @Override
    public boolean equals(Object obj) {
        return radius == ((Circle) obj).radius ? true : false;
    }
}