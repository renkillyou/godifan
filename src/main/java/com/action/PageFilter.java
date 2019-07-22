package com.action;

import com.entity.GdvUsers;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PageFilter extends HttpServlet implements Filter{//记得集成和声明
    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession(true);

        String url = request.getRequestURI();//获取地址栏的url
        GdvUsers user = (GdvUsers) session.getAttribute("user");//获取登录时存放的session

        if(url.endsWith(".css") || url.endsWith(".js") || url.endsWith(".ico") || url.endsWith(".map") || url.endsWith(".woff") || url.endsWith(".woff2") || url.endsWith(".png") || url.endsWith(".svg")) {
            chain.doFilter(request,response);
            //System.out.println("-----放行");
        }else if(user == null && url.indexOf("/htlogin.html")== -1 && !url.equals("/getAllProduct")){
            //未登陆、当前不是登陆的html、也不是登陆的.do//判断条件可以酌情添加

            String location = "/htlogin.html";//定义当访客非法访问不被允许的地址时跳转的界面
            request.getRequestDispatcher(location).forward(request, response);//跳转至指定界面
            response.setHeader("Cache-Control", "no-store");
            response.setDateHeader("Expires", 0);
            response.setHeader("Pragma", "no-cache");
            System.out.println("------已过滤");
        }
        else {
            chain.doFilter(request,response);
        }
    }

    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("------开启过滤器");
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }
}
