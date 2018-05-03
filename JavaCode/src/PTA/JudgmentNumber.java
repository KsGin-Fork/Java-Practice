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
        //System.out.println(Jn(new Scanner(System.in).next()));
    }

    /**
     * 判断字符串是否为数字
     * @param str 传入字符串
     * @return true 或者 false
     */
    public static boolean Jn(String str){

        //如果首位是'-'，则移除首位
        if (str.charAt(0) == '-'){
            str = str.substring(1);
        }

        //判断首位和末位是否为数字
        if (!Character.isDigit(str.charAt(0)) || !Character.isDigit(str.charAt(str.length()-1))){
            return false;
        }

        //小数点个数
        int pointCount = 0;

        //判断是否出现非数字和非小数点       同时统计出现小数点的个数
        for (int i = 1 ; i < str.length() ; ++i){
            if (!Character.isDigit(str.charAt(i))){
                if (str.charAt(i) == '.') pointCount++;
                else return false;
            }
        }

        //如果小数点个数大于1
        if (pointCount > 1) return false;

        return true;
    }


}
