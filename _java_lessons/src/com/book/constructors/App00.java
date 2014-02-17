package book.constructors;

public class App00 {
    String text;

    public App00(String text) {
        this.text = text;
    }

    public static void main(String[] args) {
        App00 app00 = new App00("maxim");
        System.out.println(app00.text);
    }
}
