package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);  // false means no new session will be created
        String user = (String) session.getAttribute("user");
        if (user == null) {
            response.getWriter().write("No user logged in.");
        } else {
            response.getWriter().write("Welcome back, " + user);
        }
    }
}
