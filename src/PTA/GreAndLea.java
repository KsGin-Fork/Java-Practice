package PTA;
import java.util.Scanner;
/**
 * Created by YangFan on 2016/10/8.
 */
public class GreAndLea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.print(f(m,n) + " " + m * n / f(m, n));
    }
    public static int f(int m, int n) {
        int c;
        c = m % n;
        while (c != 0) {
            m = n;
            n = c;
            c = m % n;
        }
        return n;
    }
}
