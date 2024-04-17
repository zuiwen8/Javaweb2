package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/hello")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("收到请求");
        String myheader = req.getHeader("myheader");
        String name = req.getParameter("name");
        System.out.println(name);
        System.out.println(myheader);
        Cookie cookie = new Cookie("value","12");
        resp.addCookie(cookie);
        HttpSession session = req.getSession();
//        session.getAttribute("Count");
        req.getSession().getServletContext().getAttribute("Count");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

