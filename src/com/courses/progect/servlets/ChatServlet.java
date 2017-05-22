package com.courses.progect.servlets;

import com.courses.progect.classes.Message;
import com.courses.progect.classes.MyConstans;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Irina Petrova on 18.05.2017.
 */
@WebServlet("/chat")
public class ChatServlet extends HttpServlet {
    private ArrayList<Message> listMessages = new ArrayList<>();
    private String message;
    private String username;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        message = request.getParameter(MyConstans.MESSAGE);
        username = request.getParameter(MyConstans.NAME);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(MyConstans.DATEFORMAT);
        PrintWriter out = response.getWriter();
        response.setCharacterEncoding(MyConstans.UTF8);
        response.setContentType(MyConstans.CONTENTTYPE);
        String pageString;
        boolean isMessageOrUserNameEmpty = message.isEmpty() || username.isEmpty();
        if (isMessageOrUserNameEmpty) {
            checkListMessages(out);
        } else {
            listMessages.add(new Message(message, username, simpleDateFormat.format(date)));
            printPageWithListValues(out);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void checkListMessages(PrintWriter out) {
        if (listMessages.isEmpty()) {
            out.println(MyConstans.EMPTY_PAGE);
        } else {
            printPageWithListValues(out);
        }
    }

    private void printPageWithListValues(PrintWriter out) {
        out.println(MyConstans.START_HTML_CODE);
        out.println("<div class=\"messageText\" align=\"center\">");
        for (Message messages : listMessages) {
            out.println("<h1>" + messages.getUsername() + " " + messages.getMessage() + " " + messages.getDate() + "</h1>");
        }
        out.println("</div>");
        printEndFragmentPageWithNameUser(out);
    }

    private void printEndFragmentPageWithNameUser(PrintWriter out) {
        if(username.isEmpty()){
            out.println(MyConstans.END_FRAGMENT_PAGE);
        }else {
            out.println("<br/>\n" +
                    "<form id=\"msgForm\" name=\"msgForm\" action=\"chat\" method=\"post\" align=\"center\">\n" +
                    "    <input  type=\"hidden\" id=\"username\" name=\"username\" value=" + username + ">\n" +
                    "    Message: <input type=\"text\" id=\"message\" name=\"message\">\n" +
                    "<input type=\"submit\" id=\"sendMsg\" name=\"sendMsg\" value=\"Send\">\n" +
                    "</form>\n" +
                    "<br/>\n" +
                    "</body>\n" +
                    "</html>");
        }
    }
}
