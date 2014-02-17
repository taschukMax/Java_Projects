package book.reusing_classes.ex9_ex12;

class Component1 {
    Component1() {
        System.out.println("Component1 constructor");
    }

    void dispose() {
        System.out.println("Erase component1");
    }
}

class Component2 {
    Component2() {
        System.out.println("Component2 constructor");
    }

    void dispose() {
        System.out.println("Erase component2");
    }
}

class Component3 {
    Component3() {
        System.out.println("Component3 constructor");
    }

    void dispose() {
        System.out.println("Erase component3");
    }
}

public class Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    Root() {
        System.out.println("Constructor from Root class");
    }

    void dispose() {
        System.out.println("Erase Root object");
        if (component3 != null) {
            component3.dispose();
        }
        if (component2 != null) {
            component2.dispose();
        }
        if (component1 != null) {
            component1.dispose();
        }
    }
}
