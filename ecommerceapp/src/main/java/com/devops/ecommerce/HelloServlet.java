package com.devops.ecommerce;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head><title>DevOps E-Commerce</title></head>");
        out.println("<body>");
        out.println("<h1>Hello from DevOps E-Commerce Project!</h1>");
        out.println("<p>Welcome to the Ecommerce Website.</p>");
        out.println("<a href='products'>View Products</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
