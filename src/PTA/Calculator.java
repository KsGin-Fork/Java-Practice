package PTA;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Matcher match = Pattern.compile("^(.*)(\\D)(.*)").matcher(new Scanner(System.in).nextLine());
		if (match.find()) {
			char p = match.group(2).charAt(0);
			BigDecimal result = null;
			switch (p) {
				case '+': result =  new BigDecimal(match.group(1)).add(new BigDecimal(match.group(3))); break;
				case '-': result =  new BigDecimal(match.group(1)).subtract(new BigDecimal(match.group(3))); break;
				case '/': result =  new BigDecimal(match.group(1)).divide(new BigDecimal(match.group(3)) , 0 , RoundingMode.HALF_DOWN);break;
				case '*': result =  new BigDecimal(match.group(1)).multiply(new BigDecimal(match.group(3)));break;
				default:break;
			}
			System.out.println(result);
		}
	}
}
