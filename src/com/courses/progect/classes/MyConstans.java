package com.courses.progect.classes;

/**
 * Created by John on 21.05.2017.
 */
public class MyConstans {
    public static final String NAME = "username";
    public static final String MESSAGE = "message";
    public static final String UTF8 = "UTF-8";
    public static final String DATEFORMAT = "hh:mm:ss";
    public static final String CONTENTTYPE = "text/html";
    public static final String START_HTML_CODE = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "   <meta charset=\"UTF-8\">\n" +
            "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>" +
            "    <link rel=\"icon\" href=\"images/korovka.png\" type=\"image/x-icon\">\n" +
            "    <link rel=\"shortcut icon\" href=\"images/korovka.png\" type=\"image/x-icon\">\n" +
            "    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>\n" +
            "    <script type=\"text/javascript\" src=\"jquery.js\"></script>\n" +
            "    <script type=\"text/javascript\" src=\"http://ajax.microsoft.com/ajax/jQuery/jquery-1.11.0.min.js\"></script>\n" +
            "    <title>Главная</title>\n" +
            "    <style type=\"text/css\">\n" +
            "        body {\n" +
            "            background: url(images/TebPWZ6.jpg);\n" +
            "            background-repeat: no-repeat;\n" +
            "            background-position: center top;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "<div align=\"center\">\n" +
            "    <h1>*Chat for the best*</h1>\n" +
            "</div>";

    public static String EMPTY_PAGE = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n" +
            "    <link rel=\"icon\" href=\"images/korovka.png\" type=\"image/x-icon\">\n" +
            "    <link rel=\"shortcut icon\" href=\"images/korovka.png\" type=\"image/x-icon\">\n" +
            "    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>\n" +
            "    <script type=\"text/javascript\" src=\"jquery.js\"></script>\n" +
            "    <script type=\"text/javascript\" src=\"http://ajax.microsoft.com/ajax/jQuery/jquery-1.11.0.min.js\"></script>\n" +
            "    <title>Главная</title>\n" +
            "    <style type=\"text/css\">\n" +
            "        body {\n" +
            "            background: url(images/TebPWZ6.jpg);\n" +
            "            background-repeat: no-repeat;\n" +
            "            background-position: center top;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "<div align=\"center\">\n" +
            "    <h1>*Chat for the best*</h1>\n" +
            "</div>\n" +
            "<br/>\n" +
            "<form id=\"msgForm\" name=\"msgForm\" action=\"chat\" method=\"post\" align=\"center\">\n" +
            "    Name: <input type=\"text\" id=\"username\" name=\"username\" value=\"\"/>\n" +
            "    Message: <input type=\"text\" id=\"message\" name=\"message\" value=\"\"/>\n" +
            "    <input type=\"submit\" id=\"sendMsg\" name=\"sendMsg\" value=\"Send\"/>\n" +
            "</form>\n" +
            "<br/>\n" +
            "\n" +
            "</body>\n" +
            "</html>";

    public static final String END_FRAGMENT_PAGE = "<form id=\"msgForm\" name=\"msgForm\" action=\"chat\" method=\"post\" align=\"center\">\n" +
            "    Name: <input type=\"text\" id=\"username\" name=\"username\" value=\"\"/>\n" +
            "    Message: <input type=\"text\" id=\"message\" name=\"message\" value=\"\"/>\n" +
            "    <input type=\"submit\" id=\"sendMsg\" name=\"sendMsg\" value=\"Send\"/>\n" +
            "</form>\n" +
            "<br/>\n" +
            "</body>\n" +
            "</html>\n";

}
