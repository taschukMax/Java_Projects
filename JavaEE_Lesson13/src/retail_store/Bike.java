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
    private int price;

    public Bike(String title, int price) {
        this.title = title;
        this.price = price;
    }

    private Bike() {
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {

        return title;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return this.getTitle() + ", " + this.getPrice() + "$";
    }
}
