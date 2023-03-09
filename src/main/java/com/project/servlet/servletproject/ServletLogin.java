package com.project.servlet.servletproject;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletLogin", value = "/login")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("uname");
        String password = request.getParameter("password");

            HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        out.println("You are in login servlet");
            session.setAttribute("username", userName);
            session.setAttribute("password", password);
            response.sendRedirect("dashboard.jsp");


    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
