package live.driftmen.demo01;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

public class Hello5Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        ServletContext context = this.getServletContext();
        PrintWriter out = response.getWriter();
        // 获取相对路径中的输入流对象
        InputStream in = context.getResourceAsStream("/WEB-INF/Hello5.properties");
        Properties pros = new Properties();
        pros.load(in);
        out.println("username=" + pros.getProperty("username") + "<br/>");
        out.println("password=" + pros.getProperty("password") + "<br/>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
