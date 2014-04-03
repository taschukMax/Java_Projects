package com.yakov_fain.practical_java.lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Client Symbol");
            System.exit(0);
        }
        OutputStream outbound = null;
        BufferedReader inbound = null;
        Socket clientSocket = null;
        try {
            clientSocket = new Socket("localhost", 3000);
            outbound = clientSocket.getOutputStream();
            inbound = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            outbound.write((args[0] + "\n").getBytes());
            outbound.write(("End\n").getBytes());
            String quote;
            while (true) {
                quote = inbound.readLine();
                if (quote.equals("End")) {
                    break;
                }
            }
            System.out.println("Got the quote for " + args[0] + ": " + quote);
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                outbound.close();
                inbound.close();
                clientSocket.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
