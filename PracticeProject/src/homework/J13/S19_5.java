package homework.J13;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by KsGin on 12/16/2016.
 */
public class S19_5 {
    public static void main(String[] args){
        try {
            ObjectOutputStream oj = new ObjectOutputStream(new FileOutputStream(new File("Exercise19_5.dat")));
            oj.writeObject(new Integer[]{1 , 2 , 3 , 4 , 5});
            oj.writeObject(new Date());
            oj.writeObject(3.5);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
