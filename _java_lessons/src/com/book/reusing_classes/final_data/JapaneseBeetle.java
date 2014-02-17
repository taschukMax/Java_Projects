package book.reusing_classes.final_data;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 1/29/14
 * Time: 12:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class JapaneseBeetle extends Beetle {
    int m = printInit("JapaneseBeetle.m initialized");

    JapaneseBeetle() {
        System.out.println("m = " + m);
        System.out.println("j = " + j);
    }

    static int x3 = printInit("static JapaneseBeetle.x3 initialized");

    public static void main(String[] args) {
        new JapaneseBeetle();
    }
}

