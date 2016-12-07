package homework.J12;

/**
 * Created by KsGin on 12/7/2016.
 */
public class X21_3 {
    public static void main(String[] args){
        Integer[] a = {3 , 2 , 4 ,1 ,23, 12};
        selectionSort(a);
        for (Integer s : a) {
            System.out.print(s + " ");
        }
    }

    public static <E extends Comparable<E>> void selectionSort(E[] list){
        for (int i = 0 ; i < list.length ; ++i){
            int currminIndex = i;
            for (int j = i ; j < list.length ; ++j){
                if (list[j].compareTo(list[currminIndex]) < 0){
                    currminIndex = j;
                }
            }
            E t = list[currminIndex];
            list[currminIndex] = list[i];
            list[i] = t;
        }
    }
}
