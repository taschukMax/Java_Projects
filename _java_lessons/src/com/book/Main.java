package book;

class Program {
    Program(int i) {
        System.out.println("Constructor book.Program");
    }
}

class Game extends Program {

    Game(int i) {
        super(i);
        System.out.println("Constructor book.Game");
    }
}

class App extends Game {

    App() {
        super(11);
        System.out.println("book.App Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        App app = new App();
    }
}
