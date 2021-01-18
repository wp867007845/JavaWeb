package live.driftmen.demo03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "Resp03Servlet", value = "/resp03Servlet")
public class Resp03Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //浏览器有三消息头设置缓存，为了兼容性！将三个消息头都设置了
        response.setDateHeader("Expires", -1);
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/html;charset=UTF-8");
        //这⾥为了看效果
        PrintWriter printWriter = response.getWriter();
        printWriter.print("你好啊" + new Date().toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
