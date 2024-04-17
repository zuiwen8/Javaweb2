package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class hello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("收到get请求");
        HttpSession session = req.getSession();
        String name= (String) session.getAttribute("name");
        if (name!=null){
            session.setAttribute("name","zs");
        }
        System.out.println(name);
        System.out.println("session ID:"+session.getId());

    }
}
