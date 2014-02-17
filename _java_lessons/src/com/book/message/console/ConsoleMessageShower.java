package book.message.console;

import book.message.IOnStringInput;
import book.message.MessageShower;

import java.io.*;

public abstract class ConsoleMessageShower extends MessageShower {
    private final char symbol;

    public ConsoleMessageShower(String message, char symbol, IOnStringInput iOnStringInput) {
        super(message, iOnStringInput);
        this.symbol = symbol;
    }

    @Override
    public void show() {
        showLine();
        System.out.println(getMessage());
        showLine();
        inputString();
    }

    private void inputString() {
        InputStreamReader bufferedInputStream = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(bufferedInputStream);
        try {
            String stringFromUser = bufferedReader.readLine();
            getOnStringInput().onStringInput(stringFromUser);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private void showLine() {
        for (int i = 0; i < getMessage().length(); i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
