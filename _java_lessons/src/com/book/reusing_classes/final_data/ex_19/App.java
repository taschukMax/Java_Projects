package book.reusing_classes.final_data.ex_19;

class Objects {
    int i;

    public Objects(int i) {
        this.i = i;
    }

    public String toString() {
        return "" + i;
    }
}

public class App {
    public final Objects objects;

    public App(int i) {
        objects = new Objects(i);
    }
    public String toString() {
        return "Object: " + objects;
    }
    public static void main(String[] args) {
        App app = new App(5);
        System.out.println(app);
    }
}
