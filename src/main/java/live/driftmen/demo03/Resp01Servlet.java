package live.driftmen.demo03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "Resp01Servlet", value = "/resp01Servlet")
public class Resp01Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取到资源的路径
        String path = this.getServletContext().getRealPath("/files/你好.jpg");
        //读取资源
        FileInputStream fileInputStream = new FileInputStream(path);
        //获取到⽂件名,路径在电脑上保存是\\形式的。
        String fileName = path.substring(path.lastIndexOf("\\") + 1);
        //设置消息头，告诉浏览器，我要下载1.png这个图⽚
        response.setHeader("Content-Disposition", "attachment; filename="+fileName);
        response.setHeader("Content-Disposition", "attachment; filename=" +
                URLEncoder.encode(fileName, StandardCharsets.UTF_8));
        //把读取到的资源写给浏览器
        int len = 0;
        byte[] bytes = new byte[1024];
        ServletOutputStream servletOutputStream = response.getOutputStream();
        while ((len = fileInputStream.read(bytes)) > 0) {
            servletOutputStream.write(bytes, 0, len);
        }
        //关闭资源
        servletOutputStream.close();
        fileInputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
