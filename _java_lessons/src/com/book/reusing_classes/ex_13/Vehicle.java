package book.reusing_classes.ex_13;


public class Vehicle {
    void move() {
        System.out.println("Speed");
    }

    void move(String msg) {
        System.out.println("Stop: " + msg);
    }

    void obj(Vehicle vehicle) {
        System.out.println(vehicle + " is driving");
    }

}
