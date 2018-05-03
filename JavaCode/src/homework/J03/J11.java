package homework.J03;

/**
 * Created by 杨帆 on 2016/9/17.
 */
public class J11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(0,0, 0);
        System.out.println("Area = " + c1.getArea() + "\nPerimeter = " + c1.getPerimeter());
        System.out.println(c1.contains(3,3));
        System.out.println(c1.contains(new Circle2D(0,0,0)));
        System.out.println(c1.overlaps(new Circle2D(0,0,0)));
    }
}

class Circle2D{
    private double x;
    private double y;
    private double radius;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x , double y ,double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius *radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x , double y){
        double distance = Math.sqrt(Math.pow(y - this.y , 2) + Math.pow(x - this.x , 2));
        if (distance < radius){
            return true;
        }
        return false;
    }

    public boolean contains(Circle2D circle){
        double distance = Math.sqrt(Math.pow(circle.getX() - this.x , 2) + Math.pow(circle.getY() - this.y , 2));
        if (distance < Math.abs(circle.getRadius() - this.radius)) return true;
        return false;
    }

    public boolean overlaps(Circle2D circle){
        double distance = Math.sqrt(Math.pow(circle.getX() - this.x , 2) + Math.pow(circle.getY() - this.y , 2));
        if (distance > Math.abs(circle.getRadius() - this.radius) && distance < Math.abs(circle.getRadius() + this.radius))
            return true;
        return false;
    }
}