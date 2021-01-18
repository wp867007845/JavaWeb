package live.driftmen.demo03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Resp02Servlet", value = "/resp02Servlet")
public class Resp02Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setHeader("Refresh","3");
//        response.getWriter().write("time is :" + System.currentTimeMillis());
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("3秒后跳转⻚⾯.....");
        //三秒后跳转到index.jsp⻚⾯去，web应⽤的映射路径我设置成/，url没有写上应⽤名
        response.setHeader("Refresh", "3;url='/JavaWeb/index.jsp'");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
