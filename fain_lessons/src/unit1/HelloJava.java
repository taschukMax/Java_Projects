package unit1;

import java.io.FileOutputStream;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 2/5/14
 * Time: 1:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java!!!");
        String s = "string103";
        String t = "string"+"103";
        String u = new String(s);
        System.out.println((s==t) + " - " + (s==u));
        Long long1 = new Long(1);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(200));

        }
        String s111= "Hello".substring(2,3);
        System.out.println(s111);
        System.out.println(10/3>3 ? "MORE" : 10/4 < 3 ? "LESS" : "MORE");
        System.out.println(new a(){{}}.toString());

    }
}

class a implements Runnable{
    public String toString() {
        return getClass().getName();
    }

    @Override
    public void run() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

class B {

}