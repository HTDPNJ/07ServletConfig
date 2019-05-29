package com.hfut.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
/*获取在web.xml中给每个servlet单独配置的数据*/
public class ServletConfigServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig scg= this.getServletConfig();
        String str=scg.getInitParameter("config");
        System.out.println(str);
    }
}
