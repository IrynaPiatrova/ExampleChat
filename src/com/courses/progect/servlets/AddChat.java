package com.courses.progect.servlets;

import com.courses.progect.classes.Chat;
import com.courses.progect.classes.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by John on 25.05.2017.
 */
@WebServlet("/addChat")
public class AddChat extends HttpServlet {
    private static final String FULLNAME = "name";
    private static final String NAMECHAT = "nameChat";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter(FULLNAME);
        String nameChat = request.getParameter(NAMECHAT);
        Chat chat = new Chat(nameChat);
        chat.addChatter(new Message());
        Map chatters = chat.getChatters();
        request.setAttribute("fullname", name);
        request.setAttribute("chat", chat.getChatters());
        request.getRequestDispatcher("jsps/conversation.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
