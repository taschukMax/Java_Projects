package lesson17;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletPageProperties extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int fontSize = Integer.parseInt(request.getParameter("font-size"));
        String font = request.getParameter("font");
        String fontColor = request.getParameter("font-color");
        String text = request.getParameter("text");
        PageProperties properties = new PageProperties(fontSize, font, fontColor, text);
        UserSavedProperties.createProperties(properties);
    }
}
