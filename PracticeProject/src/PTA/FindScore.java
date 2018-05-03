package PTA;

import java.util.HashMap;
import java.util.Scanner;

public class FindScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Double> studentScore = new HashMap<>();

        Scanner input=new Scanner(System.in);
        String name ;
        Double score;
        
        //输入循环
        while(true)
        {
            name = input.next();
            if (name.equals("noname")) break;
            score = input.nextDouble();
            studentScore.put(name , score * 0.21);
        }

        String SearchName = input.next();

        System.out.println(studentScore.get(SearchName) == null ? "Not found." : studentScore.get(SearchName));

        input.close();
	}


}
