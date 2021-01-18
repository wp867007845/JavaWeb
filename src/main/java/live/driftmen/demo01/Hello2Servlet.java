package live.driftmen.demo01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class Hello2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        ServletConfig config = this.getServletConfig();
        String param = config.getInitParameter("encoding");
        out.println("encoding=" + param);
        String servletName = config.getServletName();
        out.println(servletName);
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        out.println(initParameterNames);
        ServletContext servletContext = config.getServletContext();
        out.println(servletContext);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //resp.getWriter().write("Hello2,Driftmen!");
        doGet(req,resp);
    }
}
