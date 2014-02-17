package book.reusing_classes.ex_13;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 1/27/14
 * Time: 4:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class BMW extends Vehicle {
    void move(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.move(1);
        bmw.move();
        bmw.move("BMW 550");
    }
}
