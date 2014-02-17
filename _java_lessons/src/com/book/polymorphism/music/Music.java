package book.polymorphism.music;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 1/30/14
 * Time: 12:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
