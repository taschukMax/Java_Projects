package com.javarush.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 4/18/14
 * Time: 1:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("c:\\data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\result.txt");
        System.out.println("Hi");
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
