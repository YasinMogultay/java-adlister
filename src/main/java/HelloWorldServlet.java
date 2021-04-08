import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello-world")
public class HelloWorldServlet extends HttpServlet {

    int hitCount;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        hitCount++;
        PrintWriter out = response.getWriter();
        String text = "";
        text += "<h2>Count the hits</h2>";
        text += "<h3>" + hitCount + "</h3>";
        text += "<form action='/hello-world' method='POST'>";
        text += "<input name='reset' placeholder='Type yes for RESET' />";
        text += "<button>Submit</button>";
        text += "</form>";
        out.println(text);

        response.setContentType("text/html");
        out.println("<h1>Hello, World!</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reset = req.getParameter("reset");

        if (reset.equalsIgnoreCase("yes")) {
            hitCount = -1;
            resp.sendRedirect("/hello-world");
        } else {
            resp.sendRedirect("/name");
        }
    }
}