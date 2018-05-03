package homework.J12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by YangFan on 12/2/2016.
 */
public class X22_5 {
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
                // Matcher m = Pattern.compile("\\b(\\w+)\\b").matcher(buf);        //鏁板瓧涔熷湪
                Matcher m = Pattern.compile("(?:\\b|'|\")([a-zA-Z\\-\\x0d\\x0a]{2,})(?:\\b|'|\")").matcher(buf);     //鍙槸鍗曡瘝 鍗曞瓧涓嶅尮閰�               
                List<String> stringArrayList = new ArrayList<>();
                while(m.find()){
                    stringArrayList.add(m.group(1).toLowerCase());
                }
                String[] strs = new String[stringArrayList.size()];
                stringArrayList.toArray(strs);
                Arrays.sort(strs);
                for (String s : strs) {
                    System.out.println(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
