package retail_store;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ServletPlaceOrder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String msg = "";
        String orderedBike = req.getParameter("bikes");
        Bike bike = new Bike(orderedBike);
        ArrayList<Bike> allBikes = new ArrayList<Bike>();
        allBikes.add(bike);
        Basket basket = new Basket(allBikes);
        System.out.println(basket);
        int basketSize = req.getParameter("quantity") == null ? -1 : Integer.parseInt(req.getParameter("quantity"));
        int allowedSize = Basket.getBasketSize();
        req.setAttribute("basketSize", basketSize);

        try {
            Basket.validateOrder(bike.getTitle(), basketSize);
            msg = "Thank you for you order!";
            req.setAttribute("message", msg);
            req.setAttribute("bikes", allBikes);
        } catch (TooManyBikesException e) {
            msg = "Sorry, you've ordered more than allowed, maximum size is: " + allowedSize + ". Your quantity is: " + basketSize;
            req.setAttribute("message", e.getMessage(msg));
        }

        req.getRequestDispatcher("/placeorder.jsp").forward(req, resp);
    }
}
