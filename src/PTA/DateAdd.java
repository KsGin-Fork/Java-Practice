package PTA;

import java.util.*;

/**
 * Created by YangFan on 2016/10/9.
 */
public class DateAdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        scanner.nextLine();
        int numDay = scanner.nextInt();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(num1);
        System.out.println(gc.get(GregorianCalendar.YEAR ) + "-" + (gc.get(GregorianCalendar.MONTH) + 1 ) + "-" + gc.get(GregorianCalendar.DAY_OF_MONTH));
        gc.setTimeInMillis(num1 + (long) numDay * 24 * 60 * 60 * 1000);
        System.out.println(gc.get(GregorianCalendar.YEAR ) + "-" + (gc.get(GregorianCalendar.MONTH) + 1 ) + "-" + gc.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
