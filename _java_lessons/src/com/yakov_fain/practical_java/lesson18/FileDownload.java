package com.yakov_fain.practical_java.lesson18;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;

public class FileDownload {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Proper Usage: java FileDownload URL OutputFileName");
            System.exit(0);
        }
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        URL remoteFile = null;
        try {
            remoteFile = new URL(args[0]);
            URLConnection fileStream = remoteFile.openConnection();
            fileOutputStream = new FileOutputStream(args[1]);
            inputStream = fileStream.getInputStream();
            int data;
            while ((data = inputStream.read()) != -1) {
                fileOutputStream.write(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("The file: " + args[0] + " has been downloaded successfully");
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
