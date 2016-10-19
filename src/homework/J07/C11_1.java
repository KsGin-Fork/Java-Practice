package homework.J07;

import java.util.Date;

/**
 * Created by YangFan on 2016/10/19.
 */
public class C11_1 {
    public static void main(String[] args){
        Triangle triangle = new Triangle(1,1.5,1,"yellow",true);
        System.out.println("Area="+triangle.getArea()+" Perimeter="+triangle.getPerimeter());
        System.out.println("Color="+triangle.getColor()+" IsFill="+triangle.isFilled());
    }
}

class Triangle extends GeometricObject{
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
    public Triangle(double side1 ,double side2 ,double side3){
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

class GeometricObject{
    private String color;
    private boolean filled;
    private Date dateCreated;
    public GeometricObject(){
        dateCreated = new Date();
    }
    public GeometricObject(String color , boolean filled){
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "color is" + color + "isFill" + filled + "created date is " + dateCreated;
    }
}