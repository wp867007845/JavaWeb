package live.driftmen.demo02;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Req06Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setAttribute("username", "流浪汉");    // 将数据存储到request对象中
        RequestDispatcher dispatcher = request.getRequestDispatcher("/req07Servlet");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
