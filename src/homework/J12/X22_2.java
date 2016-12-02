package homework.J12;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by YangFan on 12/2/2016.
 */
public class X22_2 {
    public static void main(String[] args){
        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);
            String buf = "";
            while (br.ready()){
                buf += br.readLine();
            }
            br.close();
            fr.close();
            // Matcher m = Pattern.compile("\\b(\\w+)\\b").matcher(buf);        //数字也在
            Matcher m = Pattern.compile("(?:\\b|'|\")([a-zA-Z\\-\\x0d\\x0a]{2,})(?:\\b|'|\")").matcher(buf);     //只是单词
            System.out.println(buf);
            Set<String> strSet = new HashSet<>();
            while(m.find()){
                strSet.add(m.group(1).toLowerCase());
            }
            String[] strs = new String[strSet.size()];
            strSet.toArray(strs);
            Arrays.sort(strs);
            for (String s : strs) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
