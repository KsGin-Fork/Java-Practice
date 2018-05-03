package homework.J12;

/**
 * Created by YangFan on 12/2/2016.
 */
public class X21_5 {
    public static void main(String[] args){
        System.out.println( max(new Integer[][]{ new Integer[]{ 3 , 2 } , new Integer[] { 4 ,2  , 10} } ));
    }
    public static <E extends Comparable<E>> E max(E[][] arrs){
        E maxvalue = arrs[0][0];
        for (E[] its : arrs){
            for (E it : its){
                maxvalue = it.compareTo(maxvalue) > 0 ? it : maxvalue;
            }
        }
        return maxvalue;
    }
}
