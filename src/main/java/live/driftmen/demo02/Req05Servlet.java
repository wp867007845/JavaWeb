package live.driftmen.demo02;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Req05Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
