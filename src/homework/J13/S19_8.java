package homework.J13;

import java.io.*;

/**
 * Created by KsGin on 12/16/2016.
 */
public class S19_8 {
    public static void main(String[] args){
        Count();
    }
    public static void Count(){
        int preCount;
        try {

            DataInputStream d = new DataInputStream(new FileInputStream(new File("Exercise19_8.dat")));
            preCount = d.readInt();
            //System.out.println("第"+preCount+"次执行");
            d.close();
        }catch (FileNotFoundException e){
            preCount = 0;
        }catch (IOException e){
            preCount = 0;
        }
        ++preCount;
        try {
            DataOutputStream d = new DataOutputStream(new FileOutputStream(new File("Exercise19_8.dat")));
            d.writeInt(preCount);
            d.close();
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
