package lesson17;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletReadProperties extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PageProperties pageProperties;
        pageProperties = UserSavedProperties.readProperties();
        request.setAttribute("pageProperties", pageProperties);
        request.getRequestDispatcher("/user-page-lesson17.jsp").forward(request, response);
    }
}
