package Error;

import java.util.HashMap;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        HashMap<String, Double> hashmap = new HashMap<>();

        Scanner input=new Scanner(System.in);
        String name ;
        Double score;

        do {
            name = input.next();
            if (name.equals("noname")) break;
            score = input.nextDouble();
            hashmap.put(name, score * 0.21);
        } while (true);

        String SearchName = input.next();

        System.out.println(hashmap.get(SearchName) == null ? "Not Found" : hashmap.get(SearchName));

        input.close();

    }

}

