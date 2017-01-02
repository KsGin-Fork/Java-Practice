package homework.J08;

import javafx.scene.shape.Circle;

/**
 * Created by YangFan on 2016/10/23.
 */
public class M14_2 {
    public static void main(String[] args){
        ComparableCircle circle1 = new ComparableCircle(-12);
        ComparableCircle circle2 = new ComparableCircle(-16);
        System.out.println(circle1.compareTo(circle2) == 0 ? circle1 : circle2);
    }
}


class ComparableCircle extends Circle implements Comparable<Object>{

    public ComparableCircle(double radius){
        super(radius);
    }
    public double getArea(){
        return  Math.PI*Math.pow(this.getRadius(),2);
    }
    @Override
    public int compareTo(Object c) {
        return this.getArea() >= ((ComparableCircle) c).getArea() ? 1 : -1;
    }
}