package homework.J06;

/**
 * Created by YangFan on 2016/10/13.
 */
public class M9_28 {
    public static void main(String[] args){
        System.out.println(prefix("abcdee" , "abcdfe"));
    }

    public static String prefix(String s1 , String s2){
        String prefixBuf = "";
        for (int i = 0 ; i < (s1.length() < s2.length() ? s1.length() : s2.length()) ; i++){
            if (s1.charAt(i) == s2.charAt(i)){
                prefixBuf += s1.charAt(i);
            }else{
                break;
            }
        }
        return prefixBuf;
    }
}
