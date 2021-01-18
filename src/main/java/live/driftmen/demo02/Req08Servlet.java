package live.driftmen.demo02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "Req08Servlet", value = "/req08Servlet")
public class Req08Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletOutputStream outputStream = response.getOutputStream();
//        outputStream.println("driftmen");
//        outputStream.println("浪迹天涯");
//        outputStream.write("driftmen".getBytes());
        outputStream.write("浪迹天涯".getBytes());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
