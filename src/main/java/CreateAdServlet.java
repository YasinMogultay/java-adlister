import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ads/create")
public class CreateAdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/ads/create.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    //get info from form request
    String title = req.getParameter("title");
    String description = req.getParameter("description");
    long userId = 1;
    long id = 5;

    // create an ad
    Ad adToInsert = new Ad(id,userId,title,description);
    DaoFactory.getAdsDao().insert(adToInsert);
    //redirect ad
    resp.sendRedirect("/ads");
    }
}
