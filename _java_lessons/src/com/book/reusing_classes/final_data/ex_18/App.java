package book.reusing_classes.final_data.ex_18;

class Counter {
    private static int counter;
    private int id = counter++;

    public String toString() {
        return "Counter: " + id;
    }
}

class Objects {
    final Counter counter = new Counter();
    static final Counter counter1 = new Counter();

    public String toString() {
        return "final field: " + counter + " | static final field: " + counter1;
    }
}

public class App {

    public static void main(String[] args) {
        System.out.println("First: ");
        System.out.println(new Objects());
        System.out.println("Second: ");
        System.out.println(new Objects());
    }

}
