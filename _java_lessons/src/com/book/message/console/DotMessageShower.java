package book.message.console;

import book.message.IOnStringInput;

public class DotMessageShower extends ConsoleMessageShower {
    public static final char SYMBOL = '.';

    public DotMessageShower(String message, IOnStringInput onStringInput) {
        super(message, SYMBOL, onStringInput);
    }

    @Override
    public void show() {
        super.show();
    }
}
