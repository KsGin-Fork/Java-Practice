package homework.J02;

import java.text.DecimalFormat;

/**
 * Created by imqqy on 2016/9/7.
 */
public class T08 {
    public static void main(String[] args){
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("RegularPolygon1's perimeter = " + decimalFormat.format(regularPolygon1.getPerimeter())
                + "  area = " + decimalFormat.format(regularPolygon1.getArea()));
        System.out.println("RegularPolygon2's perimeter = " + decimalFormat.format(regularPolygon2.getPerimeter())
                + "  area = " + decimalFormat.format(regularPolygon2.getArea()));
        System.out.println("RegularPolygon3's perimeter = " + decimalFormat.format(regularPolygon3.getPerimeter())
                + "  area = " + decimalFormat.format(regularPolygon3.getArea()));
    }
}



class RegularPolygon{

    private int n;
    private double side;
    private double x;
    private double y;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n , double side){
        this.side = side;
        this.n = n;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n , double side , double x , double y){
        this.side = side;
        this.n = n;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter(){
        return n*side;
    }

    public double getArea(){
        return (n*side*side)/(4*Math.tan((getPerimeter()/n)));
    }
}