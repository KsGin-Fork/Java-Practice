package play;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by KsGin on 12/7/2016.
 */
public class Map01 {
    public static void main(String[] args){


        HashMap<String, String> map = new HashMap<>();

        map.put("California","Sacramento");
        map.put("Georgia","Atlanta");
        map.put("Colorado","Denver");
        map.put("Maryland","Annapolis");
        map.put("Massachusettes","Boston");
        map.put("Ohio","Cokumbus");


        System.out.print("please input a state name:");
        System.out.println("the capital is " + map.get(new Scanner(System.in).next()));
    }
}
