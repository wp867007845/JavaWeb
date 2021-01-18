package live.driftmen.demo03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Resp06Servlet", value = "/resp06Servlet")
public class Resp06Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        // 用 HttpServletRequest 对象的 getParameter() 方法获取用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 假设用户名和密码分别为 admin 和 123456
        if ("admin".equals(username) && ("123456").equals(password)) {
            // 如果用户名和密码正确，重定向到登录成功.jsp
            response.sendRedirect("/JavaWeb/resp02.jsp");
        } else {
            // 如果用户名和密码错误，重定向到 登录失败.jsp
            response.sendRedirect("/JavaWeb/resp03.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
