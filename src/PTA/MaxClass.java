package PTA;

import java.util.Scanner;


public class MaxClass {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		String[] strings = new String[5];
		Integer[] ints = new Integer[5];
		
		for (int i = 0; i < 5; i++) {
			strings[i] = cin.nextLine();
		}
		
		for (int i = 0; i < 5; i++) {
			ints[i] = cin.nextInt();
		}
		
		System.out.println("Max string is " + max(strings));
		System.out.println("Max integer is " + max(ints));
		
		cin.close();
	}

	@SuppressWarnings("unchecked")
	public static Object max(@SuppressWarnings("rawtypes") Comparable[] A){
		Object max = A[0];
		
		for (int i = 1; i < A.length; i++) {
			if (A[i].compareTo(max) > 0) {
				max = A[i];
			}
		}
		
		return max;
	}
}
