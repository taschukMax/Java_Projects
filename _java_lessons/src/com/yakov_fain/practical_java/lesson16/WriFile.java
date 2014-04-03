package com.yakov_fain.practical_java.lesson16;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class WriFile {
    public static void main(String[] args) {
        String nextLine;
        URL url = null;
        URLConnection urlConnection = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            url = new URL("https://www.google.com.ua/");
            urlConnection = url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
            bufferedWriter = new BufferedWriter(new PrintWriter("the-file-name.txt", "UTF-8"));
            while (true) {
                nextLine = bufferedReader.readLine();
                if (nextLine != null) {
                    bufferedWriter.write(nextLine);
                    bufferedWriter.newLine();
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    if (bufferedWriter != null) {
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
