package PTA;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLConnectionDemo {
    public static void main(String[] args) throws IOException {

        SaveFile("https://github.com/KsGin/Java-Practice/releases/download/0.0.0.1/bath.txt", "./Resources/bath.txt");


        PrintFile("./Resources/bath.txt");

    }


    private static void PrintFile(String path) throws IOException {
        FileInputStream fis = new FileInputStream(new File(path));

        String str = URLDecoder.decode(new String(fis.readAllBytes()) , "UTF-8");

        System.out.println(str);

        fis.close();
    }

    private static void SaveFile(String url, String path) throws IOException {
        URL demoUrl = new URL(url);
        URLConnection uc = demoUrl.openConnection();
        InputStream is = uc.getInputStream();

        byte[] data = is.readAllBytes();
        is.close();

        data = URLEncoder.encode(new String(data) , "UTF-8").getBytes();

        FileOutputStream fos = new FileOutputStream(new File(path));
        fos.write(data);

        fos.close();
    }
}
