import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

public class ServletNewsReader extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        File file = new File("mvn.txt");
        File file2 = new File("mvn2.txt");
        NewsReader nr = new NewsReader(file);
        NewsReader nr2 = new NewsReader(file2);
        nr.start();
        nr2.start();
        try {
            nr.join();
            nr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("news.jsp").forward(request, response);
    }
}
