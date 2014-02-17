package book.polymorphism.music;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 1/30/14
 * Time: 12:28 PM
 * To change this template use File | Settings | File Templates.
 */
class Stringed extends Instrument {
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }
}

class Brass extends Instrument {
    public void play(Note note) {
        System.out.println("Bass.play() " + note);
    }
}

public class Music2 {
    public static void tune(Wind wind) {
        wind.play(Note.B_FLAT);
    }

    public static void tune(Stringed stringed) {
        stringed.play(Note.B_FLAT);
    }

    public static void tune(Brass brass) {
        brass.play(Note.B_FLAT);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
