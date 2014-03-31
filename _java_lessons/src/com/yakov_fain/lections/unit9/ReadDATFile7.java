package com.yakov_fain.lections.unit9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 3/31/14
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReadDATFile7 {
    public static void main(String[] args) {
        readFile();
        System.out.println("\n-----------------------------------------");
        readWithBuffer();
    }

    private static void readFile() {
        try (FileInputStream fileInputStream = new FileInputStream("file.dat")) {
            boolean eof = false;
            while (!eof) {
                int byteValue = fileInputStream.read();
                System.out.print(byteValue + " ");
                if (byteValue == -1) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private static void readWithBuffer() {
        try (BufferedInputStream buffer = new BufferedInputStream(new FileInputStream("file.dat"))) {
            boolean eof = false;
            while (!eof) {
                int byteValue = buffer.read();
                System.out.print(byteValue + " ");
                if (byteValue == -1) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
