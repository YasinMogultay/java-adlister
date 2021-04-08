import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    int hitCount;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        hitCount++;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String text = "";
        text += "<h2>Count the hits</h2>";
        text += "<h3>" + hitCount + "</h3>";
        text += "<form action='/hello-world' method='POST'>";
        text += "<input name='reset' placeholder='Type yes for RESET' />";
        text += "<button>Submit</button>";
        text += "</form>";
        out.println(text);
        String thingToBeGreeted = request.getParameter("name");
        if (thingToBeGreeted.equalsIgnoreCase("codeup")){
            String output = String.format("<h1>Hello, %s</h1>", thingToBeGreeted);
            out.println(output);
        } else {
            String output = String.format("<h1>Hello, %s</h1>", "World");
            out.println(output);
        }

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