package book.constructors;

public class App02 {
    public App02() {
        System.out.println("Message from App02.");
    }

    public App02(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        App02 app02 = new App02();
        App02 app022 = new App02("Hello from main method");

    }
}
