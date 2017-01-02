package homework.J13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by KsGin on 12/16/2016.
 */
public class S19_3 {
    public static void main(String[] args){
        Write();
        System.out.println(Read());
    }

    public static void Write(){
        try {
            DataOutputStream d = new DataOutputStream(new FileOutputStream(new File("Exercise19_3.dat")));
            d.writeInt(10);
            d.writeInt(12);
            d.writeInt(34);
            d.close();
        }
        catch (FileNotFoundException e){

        }
        catch (IOException e){

        }

    }

    public static double Read(){
        double sum = 0d;
        try {
            @SuppressWarnings("resource")
			DataInputStream d = new DataInputStream(new FileInputStream(new File("Exercise19_3.dat")));
            while (true){
                sum += d.readInt();
            }
        }catch (IOException e){
            return sum;
        }
    }

}
