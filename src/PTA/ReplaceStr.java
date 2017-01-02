package PTA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceStr {
    public static void main(String[] args){
    	List<String> arrStrings = new ArrayList<String>();
        String str = "";
        String tmp;
        Scanner scanner = new Scanner(System.in);
        while (!(tmp = scanner.nextLine()).equals("end")){
        	arrStrings.add(tmp);
        }
        String oldStr = scanner.nextLine();
        String newStr = scanner.nextLine();
        for (String string : arrStrings) {
			str = str + string;
		}
        scanner.close();
        str = str.replaceAll(oldStr , newStr);
        System.out.println(str);
    }
    
}
