package PTA;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by KsGin on 2017/1/4.
 */
public class JudgmentNumber {
    public static void main(String[] args){
        System.out.println(Pattern.compile("^(-?\\d+)(\\.\\d+)?$").matcher(new Scanner(System.in).next()).find());
    }
}
