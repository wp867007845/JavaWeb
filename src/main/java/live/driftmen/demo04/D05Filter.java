package live.driftmen.demo04;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

@WebFilter(filterName = "D05Filter",value = "/d05Servlet")
public class D05Filter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        // 拦截所有的请求，解决全站中文乱码，指定request和response的编码
        req.setCharacterEncoding("utf-8"); // 只对消息体有效
        res.setContentType("text/html;charset=utf-8");
        // 对 request 进行包装
        CharacterRequest characterRequest = new CharacterRequest(req);
        chain.doFilter(characterRequest, res);
    }
}

// 继承默认包装类 HttpServletRequestWrapper
class CharacterRequest extends HttpServletRequestWrapper {
    private HttpServletRequest request;
    public CharacterRequest(HttpServletRequest request) {
        super(request);
        this.request = request;
    }
    // 子类继承父类一定会覆写一些方法，此处用于重写getParameter()方法
    @Override
    public String getParameter(String name) {
        // 调用被包装对象getParameter()方法，获得请求参数
        String value = super.getParameter(name);
        if (value == null) {
            return null;
        }
        String method = super.getMethod(); // 判断请求方式
        if ("get".equalsIgnoreCase(method)) {
            try {
                value = new String(value.getBytes(StandardCharsets.UTF_8), request.getCharacterEncoding());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return value; // 解决乱码后返回结果
    }
}
