package homework.J01;

import javax.swing.*;
import java.text.DecimalFormat;
/**
 * Created by imqqy on 2016/9/4.
 */
public class T01D {
    public static void main(String[] args) {

        String employeeName = JOptionPane.showInputDialog("Enter employee's Name:");
        int workTimeInWeek =Integer.parseInt(JOptionPane.showInputDialog("Enter number of hours worked in a week:"));
        float payAnHour = Float.parseFloat(JOptionPane.showInputDialog("Enter hourly pay rate: "));
        float federalTax = Float.parseFloat(JOptionPane.showInputDialog("Enter federal tax withholding rate: "));
        float stateTax = Float.parseFloat(JOptionPane.showInputDialog("Enter state tax withholding rate: "));
        //Format
        DecimalFormat decimalFormat = new DecimalFormat(".00");
        //output
        String OutPut = "Employee Name: " + employeeName + "\nHours Worked: " + workTimeInWeek + "\nPay Rate: $" + payAnHour + "\nGross Pay: " + payAnHour * workTimeInWeek
                + "\nDeductions:\n  Federal Withholding (" + federalTax * 100 + "%): $" + decimalFormat.format(payAnHour * workTimeInWeek * federalTax)
                + "\n  Federal Withholding (" + stateTax * 100 + "%): $" + decimalFormat.format(payAnHour * workTimeInWeek * stateTax)
                + "\n  Total Deduction: $" + decimalFormat.format(payAnHour * workTimeInWeek * federalTax + payAnHour * workTimeInWeek * stateTax)
                + "\nNet Deduction: $" + decimalFormat.format(payAnHour * workTimeInWeek - payAnHour * workTimeInWeek * federalTax - payAnHour * workTimeInWeek * stateTax);

        JOptionPane.showMessageDialog(null,OutPut);
    }
}
