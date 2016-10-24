package homework.J08;

import java.util.Date;

/**
 * Created by YangFan on 2016/10/23.
 */
public class M14_9 {
    public static Object max(Comparable[] oba){
        Object maxO = oba[0];
        for (Object o : oba){
            if (((Comparable) o).compareTo(maxO) >= 0){
                maxO = o;
            }
        }
        return maxO;
    }
    public static void main(String[] args){
        System.out.println(max(new String[]{"li","yi","fei","shi","sha","bi"}));
        System.out.println(max(new Date[] {new Date() , new Date(22L),new Date(10999L)}));
        System.out.println(max(new Integer[]{2, 3, 5, 12, 4, 8, 9, 2}));
    }
}
