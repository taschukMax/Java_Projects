package book.reusing_classes.ex_16;

public class Frog extends Amphibian {
    public void print() {
        System.out.println("text 2");
    }
    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.print();
    }
}
