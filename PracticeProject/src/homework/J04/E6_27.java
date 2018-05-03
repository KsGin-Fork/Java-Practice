package homework.J04;


import java.util.Scanner;

/**
 * Created by 杨帆 on 2016/9/22.
 */
public class E6_27 {

    public static boolean equal(int[] list1 , int[] list2){
        if (list1.length != list2.length) return false;
        for (int i = 0 ; i < list1.length ; i++){
            if (list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the first integer list(the first number is list length):");
        int firstListLength = scanner.nextInt();
        int[] list1 = new int[firstListLength];
        for (int i = 0 ; i < firstListLength ; i++){
            list1[i] = scanner.nextInt();
        }
        System.out.print("Please input the second integer list(the first number is list length):");
        int secondListLength = scanner.nextInt();
        int[] list2 = new int[secondListLength];
        for (int i = 0 ; i < secondListLength ; i++){
            list2[i] = scanner.nextInt();
        }
        System.out.println(equal(list1,list2) == true ? "Two lists are identical " : "Two lists are not identical ");
    }
}
