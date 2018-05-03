package PTA;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by KsGin on 2017/1/4.
 */
public class Polynomials {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        while (cin.hasNext()){
            double A = cin.nextDouble();
            double B = cin.nextDouble();
            double C = cin.nextDouble();
            if (B != 0){
                double tmp = B*B-4*A*C;
                if (tmp < 0d){
                    System.out.println("The equation has no real roots.");
                }else{
                    double re1 = (-B + Math.sqrt(tmp)) / (2*A);
                    double re2 = (-B - Math.sqrt(tmp)) / (2*A);
                    if (tmp <  Math.pow(10 , -6)){
                        System.out.println("The root is:" + df.format(re1) + ".");
                    }else{
                        System.out.println("The roots are " + df.format(re1) + " and " + df.format(re2) + ".");
                    }
                }
            }else{
                System.out.println("The equation has no real roots.");
            }

        }
        cin.close();
    }
}
