package com.project.servlet.servletproject;
import DAO.UserDAO;
import model.User;
import org.apache.log4j.Logger;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

//@WebFilter(filterName = "FilterAuthentication", value = "/login" )
public class FilterAuthentication implements Filter {

    final static Logger logger = Logger.getLogger(FilterAuthentication.class);
    PropertyConfigurator propertyConfigurator = new PropertyConfigurator();

    public void init(FilterConfig config) throws ServletException {
        System.out.println("--------------------init------------------------");
        logger.info("Entered into authentication filter");
    }

    public void destroy() {
        System.out.println("-------------------destroy-----------------------");
        logger.info("GEt out from Authentication filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {

            if(request.getParameter("uname").equals("Sanket") && request.getParameter("password").equals("1234")){

                System.out.println("-------in auth filter----------------");
                logger.info("User is logged in -> Username :" + request.getParameter("uname"));
                out.println("Filter before");
                chain.doFilter(request, response);
                out.println("Filter after");
            } else {

                logger.error("Error occurred ->  error in username or password");
                out.println("username or password ids wrong");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
