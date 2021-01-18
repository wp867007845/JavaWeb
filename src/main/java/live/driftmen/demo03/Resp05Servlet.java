package live.driftmen.demo03;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "Resp05Servlet", value = "/resp05Servlet")
public class Resp05Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //在内存中⽣成⼀张图⽚,宽为80,⾼为20，类型是RGB
        BufferedImage bufferedImage = new BufferedImage(80, 20,
                BufferedImage.TYPE_INT_RGB);
        //获取到这张图⽚
        Graphics graphics = bufferedImage.getGraphics();

        //往图⽚设置颜⾊和字体
        graphics.setColor(Color.white);
        // graphics.fillRect(0, 0, 80, 20);
        graphics.setFont(new Font(null, Font.BOLD, 20));
        //往图⽚上写数据，先写个12345，横坐标是0，纵坐标是20【⾼度】
//        graphics.drawString("12345", 0, 20);
        graphics.drawString(makeNum(), 0, 20);
        //要往浏览器写⼀张图⽚，那要告诉浏览器回送的类型是⼀张图⽚
        response.setHeader("ContentType", "jpeg");
        //java提供了图⽚流给我们使⽤，这是⼀个⼯具类
        //把图⽚传进去，类型是jpg，写给浏览器
        ImageIO.write(bufferedImage, "jpg", response.getOutputStream());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private String makeNum() {
        Random random = new Random();
        //这样就会⽣成0-7位的随机数，现在问题⼜来了，如果随机数不够7位呢？如果不够7位，我们加到7位就⾏了
        int anInt = random.nextInt(9999999);
        //将数字转成是字符串
        String num = String.valueOf(anInt);
        //判断位数有多少个，不够就加
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 7 - num.length(); i++) {
            stringBuffer.append("0");
        }
        return stringBuffer.append(num).toString();
    }
}
