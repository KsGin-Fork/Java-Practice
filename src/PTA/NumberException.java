package PTA;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by YangFan on 2016/11/25.
 */
public class NumberException {


        public static void main(String[] args){

            Scanner cin = new Scanner(System.in);

            int num1, num2;

            System.out.print("Incorrect input and re-enter two integers:");

            while (true) {

                try {
                    num1 = cin.nextInt();
                    num2 = cin.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Incorrect input and re-enter two integers:");
                    cin = new Scanner(System.in);
                }
            }
            System.out.print("Sum is " + (num1+num2) );
        }

    }
