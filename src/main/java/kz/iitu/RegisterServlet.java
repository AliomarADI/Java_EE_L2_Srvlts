package kz.iitu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register",name = "registerPage")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response )
        throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");
        String fullName = request.getParameter("name");
        String password = request.getParameter("pass");
        String repassword = request.getParameter("repass");

        if (password.equals(repassword) && !login.isEmpty() && !password.isEmpty() ){
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }else{
            out.println("<center>\n<h1>You registered in " + login + " !</h1>");
            out.println("<h2><a href='index.jsp'>Back to main page</a></h2>\n</center>");
        }

    }



}
