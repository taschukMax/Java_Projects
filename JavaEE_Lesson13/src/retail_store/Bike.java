package retail_store;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 3/20/14
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bike {
    private String title;

    public Bike(String title) {
        this.title = title;
    }

    private Bike() {
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getTitle() {

        return title;
    }


    public String toString() {
        return this.getTitle();
    }
}
