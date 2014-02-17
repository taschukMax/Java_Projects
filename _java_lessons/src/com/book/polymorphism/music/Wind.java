package book.polymorphism.music;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 1/30/14
 * Time: 12:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Wind extends Instrument {
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }
}
