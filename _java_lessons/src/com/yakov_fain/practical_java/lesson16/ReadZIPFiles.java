package com.yakov_fain.practical_java.lesson16;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ReadZIPFiles {
    public static void main(String[] args) {
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("solution.zip"))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                System.out.println(zipEntry.getName());
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
