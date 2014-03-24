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
        int basketSize = req.getParameter("quantity") == null ? -1 : Integer.parseInt(req.getParameter("quantity"));
        int allowedSize = Basket.getBasketSize();
        req.setAttribute("basketSize", basketSize);
        if (allowedSize >= basketSize) {
            msg = "Thank you for your order!";
            req.setAttribute("message", msg);
        } else if (allowedSize < basketSize) {
            msg = "Sorry, you've ordered more than allowed, maximum size is: " + allowedSize + ". Your quantity is: " + basketSize;
            req.setAttribute("allowedSize", allowedSize);
            req.setAttribute("message", msg);
        } else if (basketSize == -1) {
            msg = "Sorry, your basket is empty";
            req.setAttribute("message", msg);
        }
        try {
            Basket.validateOrder("BMX", 5);
        } catch (TooManyBikesException e) {
            msg = "Sorry, you've ordered more than allowed, maximum size is: " + allowedSize + ". Your quantity is: " + basketSize;
            req.setAttribute("message", msg);
        }

        req.getRequestDispatcher("/placeorder.jsp").forward(req, resp);
    }
}
