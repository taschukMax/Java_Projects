package com.yakov_fain.practical_java.lesson18;

import com.sun.corba.se.impl.logging.IORSystemException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 4/2/14
 * Time: 12:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class WebSiteReader {
    public static void main(String[] args) {
        String nextLine;
        URL url = null;
        URLConnection urlConnection = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        try {
            url = new URL("http://www.google.com");
            urlConnection = url.openConnection();
            inputStreamReader = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
            bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                nextLine = bufferedReader.readLine();
                if (nextLine != null) {
                    System.out.println(nextLine);
                } else {
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null) {
                try {
                    bufferedReader.close();
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
