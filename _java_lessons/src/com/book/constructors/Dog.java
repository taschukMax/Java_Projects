package book.constructors;

public class Dog {
    public void bark() {
        System.out.println("default bark");
    }

    public void bark(int arg, String message) {
        System.out.println(arg + " ukrainian one");
    }

    public void bark(String message, int arg) {
        System.out.println("ukrainian one: " + arg);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1, "message");
        dog.bark("message", 2);
    }
}
