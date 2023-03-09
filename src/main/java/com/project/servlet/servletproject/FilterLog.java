package com.project.servlet.servletproject;
import org.apache.log4j.Logger;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Date;

//@WebFilter(filterName = "FilterLog", value = "/login")
public class FilterLog implements Filter {
    final static Logger logger = Logger.getLogger(FilterLog.class);
    public void init(FilterConfig config) throws ServletException {
        System.out.println("----------------Log filter----------------------");
        logger.info("Entered into log filter");

    }

    public void destroy() {
        System.out.println("----------------Log filter----------------------");
        logger.info("Get out from log filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("---------------inside log filter----------------");
        logger.info("Request from ip address : " +request.getRemoteAddr());
        System.out.println("Ipadd -> " +request.getRemoteAddr() + "------------"+new Date().toString()) ;
        chain.doFilter(request, response);
    }
}
