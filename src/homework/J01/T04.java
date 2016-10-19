package homework.J01;

import java.util.Scanner;

/**
 * Created by imqqy on 2016/9/4.
 */
public class T04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle1's center x- , y-coordinates,and radius:");
        double circle1X = scanner.nextDouble();
        double circle1Y = scanner.nextDouble();
        double circle1Radius = scanner.nextDouble();
        System.out.print("Enter circle2's center x- , y-coordinates,and radius:");
        double circle2X = scanner.nextDouble();
        double circle2Y = scanner.nextDouble();
        double circle2Radius = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow((circle2Y - circle1Y),2) + Math.pow((circle2X - circle1X),2));

        if (distance <= Math.abs(circle1Radius - circle2Radius)){
            System.out.println("circle2 is inside circle1");
        }else if (distance <= circle1Radius + circle2Radius){
            System.out.println("circle2 overlaps circle1");
        }else {
            System.out.println("circle2 does not overlaps circle1");
        }
    }
}
