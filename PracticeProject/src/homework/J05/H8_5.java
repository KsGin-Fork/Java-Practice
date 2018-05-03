package homework.J05;

import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by YangFan on 2016/9/29.
 */
public class H8_5 {
    public static void main(String[] args){
        GregorianCalendar gc = new GregorianCalendar(Locale.SIMPLIFIED_CHINESE);
        System.out.println(gc.get(GregorianCalendar.YEAR) + " " + gc.get(GregorianCalendar.MONTH) + " " + gc.get(GregorianCalendar.DAY_OF_MONTH));
        gc.setTimeInMillis(1234567898765L);
        System.out.println(gc.get(GregorianCalendar.YEAR) + " " + gc.get(GregorianCalendar.MONTH) + " " + gc.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
