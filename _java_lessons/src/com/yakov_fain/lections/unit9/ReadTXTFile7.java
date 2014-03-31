package com.yakov_fain.lections.unit9;

import java.io.*;

public class ReadTXTFile7 {
    public static void main(String[] args) {
        readTextFile();
        writeTextFile();
    }

    private static void readTextFile() {
        StringBuffer buffer = new StringBuffer();
        try (Reader reader = new BufferedReader(new InputStreamReader(new FileInputStream("txtfile.txt")))) {
            int ch;
            while ((ch = reader.read()) > 1) {
                buffer.append((char) ch);
            }
            System.out.println(buffer.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private static void writeTextFile() {
        String myAddress = "82, Ellsworth Ave, Harrison, NY, 10528";
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("address.txt")))) {
            writer.write(myAddress);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
