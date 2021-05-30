package br.com.desafio.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SimpleCORSFilter implements Filter {

    private final Log logger = LogFactory.getLog(SimpleCORSFilter.class);

    @Override
    public void init(FilterConfig filterConfig) {
        logger.info("Desafio | SimpleCORSFilter carregado");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse resposta = (HttpServletResponse) response;
        resposta.setHeader("Access-Control-Allow-Origin", "*");
        resposta.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT");
        resposta.setHeader("Access-Control-Max-Age", "3600");
        resposta.setHeader("Access-Control-Allow-Headers", "x-requested-with, authorization, Content-Type, Authorization");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {}
}
