package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username =req.getParameter("username");
        String password =req.getParameter("password");
        HttpSession session =req.getSession();
        String name = (String) session.getAttribute("name");
        if (name==null||name.equals("")){
            session.setAttribute("name",username);
            RequestDispatcher requestDispatcher =req.getRequestDispatcher("/index");
            requestDispatcher.forward(req,resp);
        }

    }
}
