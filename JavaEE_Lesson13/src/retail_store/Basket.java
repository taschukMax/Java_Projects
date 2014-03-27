package retail_store;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 3/20/14
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Basket {
    private static final int BASKET_SIZE = 2;
    private ArrayList basket;

    public static int getBasketSize() {
        return BASKET_SIZE;
    }

    public Basket(ArrayList<Bike> bikes) {
        this.basket = bikes;
    }

    public int getCurrentBasketSize() {
        return basket.size();
    }


    public static void validateOrder(String bikeModel, int quantity) throws TooManyBikesException {
        if (quantity > BASKET_SIZE) {
            throw new TooManyBikesException("Can not ship " + quantity + " bikes of the model " + bikeModel);
        }
    }
}
