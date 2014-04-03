package com.yakov_fain.practical_java.lesson18;

import com.sun.corba.se.impl.logging.IORSystemException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

public class WebSiteReader {
    public static void main(String[] args) {
        printStockQuote();
        URL url = null;
        URLConnection urlConnection = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        try {
            url = new URL("http://quote.yahoo.com/d/quotes.csv?s=MOT&f=sl1d1t1c1ohgv&e=.csv");
            urlConnection = url.openConnection();
            inputStreamReader = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
            bufferedReader = new BufferedReader(inputStreamReader);
            String wholePage = "";
            String txt;
            while ((txt = bufferedReader.readLine()) != null) {
                wholePage = wholePage + txt;
            }
            //System.out.println(wholePage);
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

    public static void printStockQuote() {
        URL url = null;
        String cvsString;
        URLConnection urlConnection = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        String symbol = "MOT";
        try {
            url = new URL("http://quote.yahoo.com/d/quotes.csv?s=" + symbol + "&f=sl1d1t1c1ohgv&e=.csv");
            urlConnection = url.openConnection();
            inputStreamReader = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
            bufferedReader = new BufferedReader(inputStreamReader);
            cvsString = bufferedReader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(cvsString, ",");
            String ticker = tokenizer.nextToken();
            String price = tokenizer.nextToken();
            String tradeDate = tokenizer.nextToken();
            String tradeTime = tokenizer.nextToken();
            System.out.println("Symbol: " + ticker + " Price: " + price + " Trade Date: " + tradeDate + " Trade Time: " + tradeTime);
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
