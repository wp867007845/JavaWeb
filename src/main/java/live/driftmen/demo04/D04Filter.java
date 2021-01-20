package live.driftmen.demo04;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "D04Filter",value = "/d03Servlet",initParams = {
        @WebInitParam(name="Encoding",value = "UTF-8")
})
public class D04Filter implements Filter {

    FilterConfig filterConfig;

    private String encoding;

    public void init(FilterConfig config) throws ServletException {
        this.filterConfig = config;
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        encoding = filterConfig.getInitParameter("Encoding");
        System.out.println(encoding);
        chain.doFilter(request, response);
    }
}
