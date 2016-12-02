package homework.J12;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by YangFan on 12/2/2016.
 */
public class X22_7 {
    public static void main(String[] args){
        Map<Integer , Integer> integerHashMap = new HashMap<>();
        Scanner cin = new Scanner(System.in);
        int number = cin.nextInt();
        while (number != 0){
            if (integerHashMap.get(number) == null){
                integerHashMap.put(number , 0);
            }
            integerHashMap.put(number ,integerHashMap.get(number)+1);
            number = cin.nextInt();
        }
        List<Integer> klist = new ArrayList<>(integerHashMap.keySet());
        List<Integer> vlist = new ArrayList<>();

        for (int it : klist){
            vlist.add(integerHashMap.get(it));
        }
        int maxValue = 0;
        for (int it : vlist){
            maxValue = it > maxValue ? it : maxValue;
        }
        for (int it : klist){
            if(integerHashMap.get(it) == maxValue){
                System.out.println(it);
            }
        }
    }
}
