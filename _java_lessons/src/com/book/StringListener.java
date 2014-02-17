package book;

import book.message.IOnStringInput;

public class StringListener implements IOnStringInput {

    @Override
    public void onStringInput(String input) {
        System.out.println("User input: " + input);
    }
}
