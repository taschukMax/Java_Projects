package book.constructors;

public class App03 {
    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        App03 app03 = new App03();
        method1();
        this.method1();
    }

    public static void main(String[] args) {
        App03 app03 = new App03();
        app03.method2();
    }


}
