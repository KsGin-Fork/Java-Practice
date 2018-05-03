package PTA;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class UsingGregorianCalendar {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(new Scanner(System.in).nextLong());
		System.out.println(gc.get(GregorianCalendar.YEAR) + "-" + gc.get(GregorianCalendar.MONTH) + "-" + gc.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
