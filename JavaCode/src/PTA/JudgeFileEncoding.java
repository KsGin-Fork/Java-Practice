package PTA;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class JudgeFileEncoding {
    public static void main(String[] args) throws IOException {
        File f = new File("./Resources/test.txt");

        System.out.println(getCharset(f));

    }

    private static String getCharset(File fileName) {
        BufferedInputStream bin;
        String str = " ";
        String str2 = "";
        try {
            bin = new BufferedInputStream(new FileInputStream(fileName));
            byte bs[] = new byte[10];
            while (str.matches("\\s+\\w*")) {
                bin.read(bs);
                str = new String(bs, "UTF-8");
            }
            str2 = new String(bs, "GBK");
        } catch (IOException e) {
            e.printStackTrace();
        }


        String code;

        if (str.length() <= str2.length()) {
            code = "UTF-8";
        } else {
            code = "GBK";
        }


        return code;
    }
}
