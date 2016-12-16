package homework.J13;

import java.io.*;
import java.util.Scanner;

/**
 * Created by KsGin on 12/16/2016.
 */
public class S19_14 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.print("请输入要加密的文件名:");
        String preFileName = cin.nextLine();
        System.out.print("请输入要加密的文件名:");
        String aftFileName = cin.nextLine();
        Change(preFileName,aftFileName);
    }


    public static void Change(String pre , String aft){
        try {
            DataInputStream dp = new DataInputStream(new FileInputStream(new File(pre)));
            DataOutputStream  da= new DataOutputStream(new FileOutputStream(new File(aft)));
            while (true){
                da.writeByte(dp.readByte()+5);
            }

        }catch (EOFException e){

        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
