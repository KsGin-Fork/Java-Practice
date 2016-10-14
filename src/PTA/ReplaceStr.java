package PTA;

import java.util.Scanner;

/**
 * Created by YangFan on 2016/10/9.
 */
public class ReplaceStr {
    public static void main(String[] args){
        String[] arrStr = new String[1000];
        String str = "";
        int lengStrLine = 0;
        Scanner scanner = new Scanner(System.in);
        while (!(arrStr[lengStrLine++] = scanner.nextLine()).equals("end"));
        String oldStr = scanner.nextLine();
        String newStr = scanner.nextLine();
        for (int i = 0 ; i < lengStrLine-1 ; i++){
            str = str + arrStr[i];
        }
        str = str.replaceAll(oldStr , newStr);
        System.out.println(str);
    }
}
