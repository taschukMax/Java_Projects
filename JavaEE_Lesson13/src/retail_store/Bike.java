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
    private int quantity;

    public Bike(String title, int price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public Bike(String title, int price) {
        this.title = title;
        this.price = price;
        this.quantity = 1;

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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {

        return quantity;
    }
}
