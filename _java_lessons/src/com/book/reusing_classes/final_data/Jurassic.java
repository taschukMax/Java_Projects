package book.reusing_classes.final_data;

class SmallBrain {
}

final class Dinosaur {
    int i = 7;
    int j = 13;
    SmallBrain x = new SmallBrain();

    void f() {
    }
}

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur();
        dinosaur.f();
        dinosaur.i = 40;
        dinosaur.j++;
    }
}
