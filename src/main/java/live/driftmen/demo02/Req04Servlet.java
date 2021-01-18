package live.driftmen.demo02;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Req04Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取到⽹⻚是从哪⾥来的
        String referer = request.getHeader("Referer");
        //如果不是从我的⾸⻚来或者从地址栏直接访问的，
        if ( referer == null ||
                !referer.contains("localhost:8080/JavaWeb/req04.jsp") ) {
            //回到⾸⻚去
            response.sendRedirect("/JavaWeb/req04.jsp");
            return;
        }
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("video.driftmen.live页面的视频资源");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
