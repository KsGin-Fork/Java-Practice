package PTA;

import java.util.Scanner;


public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			Trim(cin.next(), cin.next());
		}
		
		cin.close();
	}

	private static void Trim(String s1 , String s2) {
		
		StringBuilder re = new StringBuilder();
		for (int i = 0; i < (s1.length() < s2.length() ? s1.length() : s2.length()); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				break;
			}
			re.append(s1.charAt(i));
		}
		
		
		if (re.length() == 0) {
			System.out.println("No common prefix");
		}else {
			System.out.println("The common prefix is " + re.toString());
		}
	}
	
}
