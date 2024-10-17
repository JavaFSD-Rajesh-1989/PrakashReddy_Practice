package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")  // Maps this servlet to /hello URL pattern
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Setting the content type to HTML
        response.setContentType("text/html");
        // Writing a simple HTML response
        response.getWriter().write("<h1>Hello, Servlet World!</h1>");
    }
}
