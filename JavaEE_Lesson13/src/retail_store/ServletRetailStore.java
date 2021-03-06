package retail_store;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 3/20/14
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class ServletRetailStore extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Bike bike = new Bike("BMX", 1200);
        Bike bike2 = new Bike("BMX", 1300);
        Bike bike3 = new Bike("BMX", 1400);
        ArrayList<Bike> allBikes = new ArrayList<Bike>();
        allBikes.add(bike);
        allBikes.add(bike2);
        allBikes.add(bike3);
        request.setAttribute("allBikes", allBikes);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
