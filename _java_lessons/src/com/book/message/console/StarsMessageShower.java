package book.message.console;

import book.message.IOnStringInput;

public class StarsMessageShower extends ConsoleMessageShower {
    private static final char SYMBOL = '*';

    public StarsMessageShower(String message, IOnStringInput onStringInput) {
        super(message, SYMBOL, onStringInput);
    }

    @Override
    public void show() {
        super.show();
    }
}
