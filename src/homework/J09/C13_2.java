package homework.J09;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by YangFan on 2016/10/26.
 */
public class C13_2 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int num1, num2;
        System.out.print("Please input two integer:");
        while (true) {
            try {
                num1 = Integer.parseInt(cin.nextLine());
                num2 = Integer.parseInt(cin.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Entered incorrectly!\nPlease input two integer number again:");
                cin = new Scanner(System.in);
            }
        }
        System.out.println("Result is " + (num1+num2) );
    }
}
