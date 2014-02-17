package book.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 1/2/14
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    public String toString() {
        return super.toString() + " " + s;
    }
}

public class App01 {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list, new StringAddress("World!"));
        System.out.println(list);
        Collections.fill(list, new StringAddress("Maxim"));
        System.out.println(list);
    }
}
