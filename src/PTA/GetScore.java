package PTA;

import java.util.HashMap;
import java.util.Scanner;

public class GetScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Double> hashmap = new HashMap<>();

        Scanner input=new Scanner(System.in);
        String name ;
        Double score;
        while(true)
        {
            name = input.next();
            if (name.equals("noname")) break;
            score = input.nextDouble();
            hashmap.put(name , score * 0.21);
        }

        String SearchName = input.next();

        System.out.println(hashmap.get(SearchName) == null ? "Not found." : hashmap.get(SearchName));

        input.close();
	}


}
