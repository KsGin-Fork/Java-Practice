package PTA;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		long lg = cin.nextLong();
		
		cin.close();
			
		for (BigDecimal i = new BigDecimal(Long.MAX_VALUE + "").add(BigDecimal.ONE);;i = i.add(BigDecimal.ONE)) {
			if (i.remainder(new BigDecimal(lg)).equals(BigDecimal.ZERO)) {
				for (int j = 0; j < 3; j++) {
					BigDecimal r = i.divide(new BigDecimal(lg));
					System.out.println(r.add(new BigDecimal(j)).multiply(new BigDecimal(lg)));
				}
				break;
			}
		}
	}
}
