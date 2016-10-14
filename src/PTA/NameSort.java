package PTA;



import java.util.Arrays;
        import java.util.Scanner;


/**
 * Created by YangFan on 2016/10/9.
 */
public class NameSort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        scanner.nextLine();
        String[] arrStr = new String[len];
        for (int i = 0 ; i < len ; i++){
            arrStr[i] = scanner.nextLine();
        }
        Arrays.sort(arrStr);
        for (int i = 0 ; i < len ; i++){
            System.out.println(arrStr[i]);
        }
    }
}