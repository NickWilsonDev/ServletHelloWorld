/**
 * @author Nick Wilson
 * @version 8.22.15
 *
 * Basic hello world servlet, uses Tomcat.
 * Follows this tutorial
 * http://www.tutorialspoint.com/servlets/servlets-first-example.htm
 */

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Class extends HttpServlet
 */
public class HelloWorld extends HttpServlet {

    private String message;

    public void init() throws ServletException {
        // required initialization
        message = "Hello World";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    public void destroy() {
        // do nothing
    }
}
