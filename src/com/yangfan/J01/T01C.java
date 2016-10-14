package com.yangfan.J01;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by imqqy on 2016/9/4.
 */
public class T01C {
    public static void main(String[] args){
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's Name: ");
        String employeeName = scanner.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        int workTimeInWeek = scanner.nextInt();
        System.out.println("Enter hourly pay rate: ");
        float payAnHour = scanner.nextFloat();
        System.out.println("Enter federal tax withholding rate: ");
        float federalTax = scanner.nextFloat();
        System.out.println("Enter state tax withholding rate: ");
        float stateTax = scanner.nextFloat();
        scanner.close();
        //Format
        DecimalFormat decimalFormat = new DecimalFormat(".00");
        //output
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + workTimeInWeek);
        System.out.println("Pay Rate: $" + payAnHour);
        System.out.println("Gross Pay: "+ payAnHour * workTimeInWeek);
        System.out.println("Deductions:\n  Federal Withholding (" +federalTax * 100 + "%): $" + decimalFormat.format(payAnHour * workTimeInWeek * federalTax));
        System.out.println("  Federal Withholding (" + stateTax * 100 + "%): $" + decimalFormat.format(payAnHour * workTimeInWeek * stateTax));
        System.out.println("  Total Deduction: $" + decimalFormat.format(payAnHour * workTimeInWeek * federalTax + payAnHour * workTimeInWeek * stateTax) );
        System.out.println("Net Deduction: $" + decimalFormat.format(payAnHour * workTimeInWeek - payAnHour * workTimeInWeek * federalTax - payAnHour * workTimeInWeek * stateTax) );
    }
}
