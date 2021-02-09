package kz.iitu;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginPage", urlPatterns = "/login")

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws SecurityException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        out.println("<center>\n<h1>You logged in " +login + " !</h1>");
        out.println("<h2><a href='home.jsp'>Back to main page</a></h2>\n</center>");
    }

}
