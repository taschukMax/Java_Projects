package book.reusing_classes.ex9_ex12;

public class Stem extends Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    Stem() {
        System.out.println("Stem constructor");
    }

    void dispose() {
        System.out.println("Erase Stem object");
        if (component3 != null) {
            component3.dispose();
        }
        if (component2 != null) {
            component2.dispose();
        }
        if (component1 != null) {
            component1.dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
        stem.dispose();

    }
}
