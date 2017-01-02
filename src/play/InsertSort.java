package play;

/**
 * Created by KsGin on 12/7/2016.
 */
public class InsertSort {

        public static void main(String[] args){
            Double[] s = {1d , 3.2d , 4d , 2d};
            Sort(s);
            for (Double x : s){
                System.out.println(x + " ");
            }
        }


        public static <E extends Comparable<E>> void Sort(E[] list){
                for (int i = 0 ; i < list.length ; ++i){
                    E currentElement = list[i];
                    int k;
                    for(k = i - 1 ; k >= 0 && list[k].compareTo(currentElement) > 0  ; k--){
                        list[k+1] = list[k];
                    }
                    list[k+1] = currentElement;
                }
        }

}
