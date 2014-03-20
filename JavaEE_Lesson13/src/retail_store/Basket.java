package retail_store;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 3/20/14
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Basket {
    private static final int BASKET_SIZE = 2;
    private Bike bikes;

    public static int getBasketSize() {
        return BASKET_SIZE;
    }

    public Basket(Bike bikes) {
        this.bikes = bikes;
    }
}
