package homework.J12;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by YangFan on 12/2/2016.
 */
public class X22_1 {
    public static void main(String[] args){
        Set<String> stringSet1 = new HashSet<>();
        stringSet1.add("George");
        stringSet1.add("Jim");
        stringSet1.add("John");
        stringSet1.add("Blake");
        stringSet1.add("Kevin");
        stringSet1.add("Mechael");
        Set<String> stringSet2 = new HashSet<>();
        stringSet2.add("George");
        stringSet2.add("Katie");
        stringSet2.add("Kevin");
        stringSet2.add("Michelle");
        stringSet2.add("Ryan");
        System.out.println("set1 = " + stringSet1);
        System.out.println("set2 = " + stringSet2);
        Set<String> sSet1 = new HashSet<>(stringSet1);
        Set<String> sSet2 = new HashSet<>(stringSet2);
        sSet1.addAll(sSet2);
        System.out.println("set1 + set2 = " + sSet1);

        sSet2 = new HashSet<>(stringSet2);
        sSet1.removeAll(sSet2);
        System.out.println("set1 - set2 = " + sSet1);
        sSet1 = new HashSet<>(stringSet1);
        sSet2.removeAll(sSet1);
        System.out.println("set2 - set1 = " + sSet2);
        stringSet1.addAll(stringSet2);
        stringSet1.removeAll(sSet2);
        sSet2 = new HashSet<>(stringSet2);
        sSet1.removeAll(sSet2);
        stringSet1.removeAll(sSet1);
        System.out.println(stringSet1);
    }
}
