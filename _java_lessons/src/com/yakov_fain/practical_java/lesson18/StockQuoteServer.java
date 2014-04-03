package com.yakov_fain.practical_java.lesson18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class StockQuoteServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket client = null;
        BufferedReader inbound = null;
        OutputStream outbound = null;
        try {
            serverSocket = new ServerSocket(3000);
            System.out.println("Waiting for a quote request");
            while (true) {
                client = serverSocket.accept();
                inbound = new BufferedReader(new InputStreamReader(client.getInputStream()));
                outbound = client.getOutputStream();
                String symbol = inbound.readLine();
                String price = (new Double(Math.random() * 100)).toString();
                outbound.write(("\n The price of " + symbol + " is " + price + " \n").getBytes());
            }
        } catch (IOException e) {
            System.out.println("Error in Server" + e);
        } finally {
            try {
                inbound.close();
                outbound.close();
            } catch (Exception e) {
                System.out.println("StockQuoteServer: can't close streams " + e.getMessage());
            }
        }
    }
}
