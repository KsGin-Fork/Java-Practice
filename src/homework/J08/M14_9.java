package homework.J08;

/**
 * Created by YangFan on 2016/10/23.
 */
public class M14_9 {
    public static Object max(Comparable[] oba){
        Object maxO = oba[0];
        for (Object o : oba){
            if (((Comparable) o).compareTo(maxO) == 1){
                maxO = o;
            }
        }
        return maxO;
    }
}
