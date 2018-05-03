package com.ksgin;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here

        copyFileUsingStream("./Resources/Book.zip" , "./Resources/BookBackup1.zip");
        copyFileUsingBuffer("./Resources/Book.zip" , "./Resources/BookBackup2.zip");
        copyFileUsingMap("./Resources/Book.zip" , "./Resources/BookBackup3.zip");

    }

    private static void copyFileUsingMap(String input, String output) throws IOException{
        long startTime = System.currentTimeMillis();

        File inputFile = new File(input);

        byte[] data = new byte[(int)inputFile.length()];

        MappedByteBuffer fisMappedBuffer = new RandomAccessFile(inputFile , "r")
                .getChannel().map(FileChannel.MapMode.READ_ONLY , 0 , inputFile.length());
        fisMappedBuffer.get(data);

        File outputFile = new File(output);
        if (!outputFile.exists()){
            if(!outputFile.createNewFile()){
                System.out.println("新建文件失败");
                return;
            }
        }

        MappedByteBuffer fosMappedBuffer = new RandomAccessFile(outputFile , "rw").getChannel()
                .map(FileChannel.MapMode.READ_WRITE , 0 , inputFile.length());
        fosMappedBuffer.put(data);

        long endTime = System.currentTimeMillis();

        System.out.println("使用映射拷贝内容，文件大小为" + inputFile.length() + " 耗时为 : " + (endTime - startTime) + "ms");
    }


    private static void copyFileUsingBuffer(String input, String output) throws IOException{
        long startTime = System.currentTimeMillis();

        File inputFile = new File(input);

        FileChannel fisChannel = new RandomAccessFile(inputFile , "r").getChannel();
        ByteBuffer data = ByteBuffer.allocate((int)inputFile.length());
        fisChannel.read(data);
        fisChannel.close();

        File outputFile = new File(output);
        if (!outputFile.exists()){
            if(!outputFile.createNewFile()){
                System.out.println("新建文件失败");
                return;
            }
        }

        FileChannel fosChannel = new RandomAccessFile(outputFile , "rw").getChannel();
        fosChannel.write(data);
        fosChannel.close();

        long endTime = System.currentTimeMillis();

        System.out.println("使用通道拷贝内容，文件大小为" + inputFile.length() + " 耗时为 : " + (endTime - startTime) + "ms");
    }

    private static void copyFileUsingStream(String input, String output) throws IOException {

        long startTime = System.currentTimeMillis();

        File inputFile = new File(input);

        FileInputStream fis = new FileInputStream(inputFile);
        byte[] data = fis.readAllBytes();
        fis.close();

        File outputFile = new File(output);
        if (!outputFile.exists()){
            if(!outputFile.createNewFile()){
                System.out.println("新建文件失败");
                return;
            }
        }

        FileOutputStream fos = new FileOutputStream(outputFile);
        fos.write(data);
        fos.close();

        long endTime = System.currentTimeMillis();

        System.out.println("使用流拷贝内容，文件大小为" + inputFile.length() + " 耗时为 : " + (endTime - startTime) + "ms");
    }

}
