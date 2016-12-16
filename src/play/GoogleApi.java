package play;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by KsGin on 12/12/2016.
 */
public class GoogleApi {
    public static void main(String[] args){
        URL url = null;
        try {
            url = new URL("http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=oschina");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        URLConnection connection = null;
        try {
            connection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        connection.addRequestProperty("Referer", "http://www.oschina.net/");

        String line;
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

// now have some fun with the results...
    }
}
