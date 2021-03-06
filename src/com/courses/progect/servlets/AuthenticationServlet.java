package com.courses.progect.servlets;

import com.courses.progect.classes.Chat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Irina Petrova on 18.05.2017.
 */
@WebServlet("/Authentication")
public class AuthenticationServlet extends HttpServlet {

    private static final String USERNAME = "username";
    private static final String LASTNAME = "lastname";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter(USERNAME);
        String lastname = request.getParameter(LASTNAME);
        String full = username + " " + lastname;
        request.setAttribute("fullname", full);
        request.setAttribute("chat", new Chat().getChatters());
        request.getRequestDispatcher("jsps/conversation.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
