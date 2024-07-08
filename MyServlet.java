package MySimpleStoreServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<title>My Simple Store</title>");
        out.println("<link rel=\"stylesheet\" href=\"style.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<header>");
        out.println("<h1>INDIAN MART</h1>");
        out.println("<nav>");
        out.println("<a href=\"#\">Home</a>");
        out.println("<a href=\"contact.html\">Contact</a>");
        out.println("<a href=\"aboutus.html\">About Us</a>");
        out.println("</nav>");
        out.println("</header>");
        out.println("<main>");
        out.println("<h2>Featured Products</h2>");
        out.println("<section class=\"product\">");
        out.println("<img src=\"https://www.kidstoysnews.com/wp-content/uploads/2017/11/Best-Choice-Products-Kids-12V-Ride-On-Car.jpg\"  width=\"100\" height=\"100\">");
        out.println("<h3>car</h3>");
        out.println("<p>Description of product 1</p>");
        out.println("<span class=\"price\">Rs.529.00</span>");
        out.println("</section>");
        out.println("<section class=\"product\">");
        out.println("<img src=\"https://imgd-ct.aeplcdn.com/664x415/n/cw/ec/34560/mini-cooper-exterior3.jpeg?q=80\"  width=\"100\" height=\"100\">");
        out.println("<h3>mini cooper model toy car</h3>");
        out.println("<p>Description of product 2</p>");
        out.println("<span class=\"price\">Rs.1029.00</span>");
        out.println("</section>");
        out.println("<section class=\"product\">");
        out.println("<img src=\"https://stimg.cardekho.com/images/carexteriorimages/930x620/Rolls-Royce/Ghost/8051/1601280317407/front-left-side-47.jpg\"  width=\"100\" height=\"100\">");
        out.println("<h3>mini rolls royce car</h3>");
        out.println("<p>Description of product 2</p>");
        out.println("<span class=\"price\">Rs.1359.00</span>");
        out.println("</section>");
        out.println("<section class=\"product\">");
        out.println("<img src=\"https://www.cnet.com/a/img/resize/5c7b63267028cc58cde632deb8ecc172715a6d55/hub/2018/04/27/a24c3a2e-234c-40b0-8b1a-64698d4eeb99/classic-jaguar-type-e-1964.jpg?auto=webp&width=1200\"  width=\"100\" height=\"100\">");
        out.println("<h3>mini classic car</h3>");
        out.println("<p>Description of product 3</p>");
        out.println("<span class=\"price\">Rs.1029.00</span>");
        out.println("</section>");
        out.println("<section class=\"product\">");
        out.println("<img src=\"https://5.imimg.com/data5/BC/HS/CD/SELLER-11310077/kids-electric-car-ride-on-car-1-1000x1000.jpg\"  width=\"100\" height=\"100\">");
        out.println("<h3>MINI benz car</h3>");
        out.println("<p>Description of product 4</p>");
        out.println("<span class=\"price\">Rs.1029.00</span>");
        out.println("</section>");
        out.println("<section class=\"product\">");
        out.println("<img src=\"https://5.imimg.com/data5/SELLER/Default/2021/10/DA/FX/BM/4370338/11-carat-children-kids-electric-ride-on-mini-cooper-car-with-projector-1000x1000.jpg\"  width=\"100\" height=\"100\">");
        out.println("<h3>mini cooper model toy car</h3>");
        out.println("<p>Description of product 2</p>");
        out.println("<span class=\"price\">Rs.1029.00</span>");
        out.println("</section>");
        out.println("</main>");
        out.println("<footer>");
        out.println("<p>&copy; INIAN MART 2024</p>");
        out.println("</footer>");
        out.println("</body>");
        out.println("</html>");
    }
}
