package homework.J01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by imqqy on 2016/9/3.
 */
public class T03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#0.######");
        System.out.print("Enter a , b , c :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double detail = b*b - 4*a*c;
        if (detail > 0){
            System.out.println("The roots are : " + decimalFormat.format(((-1 * b + Math.sqrt(detail)) / (2 * a))) + " and " + decimalFormat.format(((-1 * b - Math.sqrt(detail))/ (2 * a))));
        }else if (detail == 0){
            System.out.println("The root are : " + decimalFormat.format((-1 * b + Math.sqrt(detail)) / (2 * a)) );
        }else{
            System.out.println("The equation has no real roots : ");
        }
    }
}
