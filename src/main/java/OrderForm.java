import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/order-form")
public class OrderForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setHeader("content-type", "text/html");
        String output = "";
        output += "<h1>Form Page</h1>";
        output += "<form action='/order-summary' method='POST'>";
        output += "<input name='product' placeholder='Name Of Product' /> <br>";
        output += "<input name='quantity' placeholder='Quantity' /> <br>";
        output += "<button>Order</submit>";
        output += "</form>";
        out.println(output);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String product = req.getParameter("product");
        String quantity = req.getParameter("quantity");
        out.println("<h1>" + product + "</h1>");
        out.println("<h1>" + quantity + "</h1>");
    }
}
