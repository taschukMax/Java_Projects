package com.yakov_fain.lections.unit9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDATFile {
    public static void main(String[] args) {

        BufferedInputStream buffer = null;
        try {
            buffer = new BufferedInputStream(new FileInputStream("file.dat"));
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
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
