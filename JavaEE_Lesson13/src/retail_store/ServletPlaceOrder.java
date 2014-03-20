package retail_store;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletPlaceOrder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int basketSize = Integer.parseInt(req.getParameter("basketSize"));
        int allowedSize = Basket.getBasketSize();
        req.setAttribute("basketSize", basketSize);
        if (allowedSize <= basketSize) {
            String msg = "Sorry, you've ordered more than allowed, maximum size is: " + allowedSize;
            req.setAttribute("allowedSize", allowedSize);
            req.setAttribute("message", msg);
        }
        req.getRequestDispatcher("/placeorder.jsp").forward(req, resp);
    }
}
