package homework.J04;


/**
 * Created by 杨帆 on 2016/9/21.
 */
public class E6_17 {

    private static double[] myList = {2,9,1,9,2,13,56,5,2,7};
    public static void main(String[] args){
        sort(myList);
        for(int i = 0 ; i < myList.length ; i++){
            System.out.print(myList[i] + " ");
        }
    }

    public static void sort(double[] list){
        for (int i = list.length-1 ; i > 0 ; i--){
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i-1 ; j >= 0 ; j--){
                if (currentMax < list[j]){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i){
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }

        }
    }
}
