package book.constructors;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ String arg only, s = " + ss);
    }

    Flower(String s, int petals) {
        this(petals);
        System.out.println("String & int args");
    }

    Flower() {
        this("rose", 47);
    }

    public String toString() {
        return petalCount + ", " + s;
    }

    public static void main(String[] args) {
        Flower flower = new Flower();

    }
}
