package live.driftmen.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Coo007Servlet", value = "/coo007Servlet")
public class Coo007Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置response的编码
        response.setContentType("text/html;charset=UTF-8");
        String username = "Driftmen001";
        //创建Cookie对象，指定名称和值
        Cookie cookie = new Cookie("username", username);
        cookie.setDomain("driftmen.live");
        //向浏览器给⼀个Cookie
        response.addCookie(cookie);
        response.getWriter().write("我已经向浏览器发送了一个Cookie");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
