package PTA;

import java.util.HashMap;
import java.util.Scanner;

public class FindTel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		HashMap<String, String> contact = new HashMap<String, String>();
		while(true){
			String nameString = cin.next();
			if (nameString.equals("noname")) {
				break;
			}
			String telString = cin.next();
			
			contact.put(nameString, telString);
			
		}
		
		
		String findNameString = cin.next();
		
		cin.close();
		
		System.out.println(contact.get(findNameString) == null ? "Not found." : contact.get(findNameString));
	}

}
