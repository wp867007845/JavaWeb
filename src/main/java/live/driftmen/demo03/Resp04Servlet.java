package live.driftmen.demo03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

@WebServlet(name = "Resp04Servlet", value = "/resp04Servlet")
public class Resp04Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ss = "serqoikdspojgi09erjfoiwdsjfosjfmdf" +
                "cosafdswoifkcmsfo0wekfpowsak,oc0w,sdfpw,eof" +
                "edfjwsaijfoipwdcsdokjfoi0wekdfopqskfodisjf" +
                "detfgwdfverfyghrfgberfwerfewhrtfgvwdsfw" +
                "bvfegedfwedsfoivkefmigoemrger" +
                "vgerf,opgkeorpkgoerpkgfewptlgferre" +
                "befogkerpgkvepdkge-orkb,dflgwposdm";
//        response.getWriter().write("原来的⻓度是："+ss.getBytes().length+"</br>");
//        //输出给浏览器
//        response.getWriter().write(ss);
        System.out.println("原来的⻓度是：" + ss.getBytes().length);
        //创建GZIPOutputStream对象，给予它ByteArrayOutputStream
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gzipOutputStream = new
                GZIPOutputStream(byteArrayOutputStream);
        //GZIP对数据压缩，GZIP写⼊的数据是保存在byteArrayOutputStream上的
        gzipOutputStream.write(ss.getBytes());
        //gzipOutputStream有缓冲，把缓冲清了，并顺便关闭流
        gzipOutputStream.close();
        //将压缩的数据取出来
        byte[] bytes = byteArrayOutputStream.toByteArray();
        System.out.println("现在的长度：" + bytes.length);
        //告诉浏览器这是gzip压缩的数据
        response.setHeader("Content-Encoding","gzip");
        //将压缩的数据写给浏览器
        response.getOutputStream().write(bytes);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
