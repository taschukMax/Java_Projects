package retail_store;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
        Bike bike = new Bike("BMX");
        Bike bike2 = new Bike("Mountain Bike");
        Bike bike3 = new Bike("Cross bike");
        ArrayList<Bike> allBikes = new ArrayList<Bike>();
        allBikes.add(bike);
        allBikes.add(bike2);
        allBikes.add(bike3);
        request.setAttribute("allBikes", allBikes);
        request.setAttribute("bikesQuantity", allBikes.size());
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
