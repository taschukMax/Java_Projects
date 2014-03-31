package com.yakov_fain.lections.unit9;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 3/31/14
 * Time: 4:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class WriteDATFile7 {
    public static void main(String[] args) {
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        try (FileOutputStream myFile = new FileOutputStream("file2.dat")) {
            for (int aData : data) {
                myFile.write(aData);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
