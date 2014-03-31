package lesson17;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletMain extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PageProperties pageProperties = UserSavedProperties.readProperties();
        if (pageProperties != null) {
            request.setAttribute("pageProperties", pageProperties);
            response.sendRedirect("/user-page-lesson17.jsp");
        } else {
            response.sendRedirect("/lesson17.jsp");
        }

    }
}
