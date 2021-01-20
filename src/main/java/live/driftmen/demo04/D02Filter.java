package live.driftmen.demo04;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "D02Filter",value = "/d02Servlet")
public class D02Filter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("这是D02Filter放行之前");
        chain.doFilter(request, response);
        System.out.println("这是D02Filter放行之后");
    }
}
