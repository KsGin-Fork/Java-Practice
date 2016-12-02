package homework.J12;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by YangFan on 12/2/2016.
 */


public class X21_2{
    public static void main(String[] args){
        System.out.println(BinarySearch.binarySearch( new Integer[] {1 , 2 , 3 , 4 ,5 } , 1));
    }
}


class BinarySearch {

    public static <E extends Comparable<E>> int binarySearch(E[] list ,E key){
        int mid , start = 0 , end = 0;
        for (E it : list){
            ++end;
        }
        while (start <= end){
            mid = start + (end-start) / 2;
            if (list[mid].compareTo(key) < 0){
                start = mid + 1;
            }
            else if(list[mid].compareTo(key) > 0){
                end = mid - 1;
            }
            else
                return mid;
        }
        return -1;
    }
}
