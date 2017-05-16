package edu.nuist.duanxun.guyongqiang.action.admin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by John on 2017/5/16.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        String account = request.getParameter("account").trim();
        String password = request.getParameter("password").trim();
        if (account.equals("admin") && password.equals("admin")) {
            HttpSession session = request.getSession();
            session.setAttribute("account", account);
            response.sendRedirect("student_list");
        } else {
            response.sendRedirect("login_fail.jsp");
        }
    }
}
