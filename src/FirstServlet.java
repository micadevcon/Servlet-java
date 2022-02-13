import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title> MyServlet</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h1>Reservation</h1>");
        pw.println(request.getParameter("Name") + "'s You has been reserved.");
        pw.println("<br>"+ request.getParameter("age") + "-age.");
        pw.println("</body>");
        pw.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    PrintWriter pw = response.getWriter();
    pw.println("<html>");
    pw.println("hello");
        pw.println("<form action=\"\" method=\"post\">");
        pw.println("<div> Name: </div>");
        pw.println("<input type=\"text\" name=\"Name\" value=\"\"\n" + "size=\"30\"/>");
        pw.println("<div> Age: </div>");
        pw.println("<input type=\"text\" name=\"age\" value=\"\"\n" + "size=\"30\"/>");
        pw.println(" <button type=\"submit\">Send your message</button>");
        pw.println("<form>");
    pw.println("</html>");
    }
}
