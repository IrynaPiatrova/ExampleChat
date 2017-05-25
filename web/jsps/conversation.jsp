<%@ page import="com.courses.progect.classes.Chat" %>
<%@ page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: Irina Petrova
  Date: 23.05.2017
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="icon" href="../images/korovka.png" type="image/x-icon">
    <link rel="shortcut icon" href="../images/korovka.png" type="image/x-icon">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="../css/style.css" media="screen" type="text/css"/>
    <script type="text/javascript" src="jquery.js"></script>
    <script type="text/javascript" src="http://ajax.microsoft.com/ajax/jQuery/jquery-1.11.0.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <title>Главная</title>
    <style type="text/css">
        body {
            background: url(../images/TebPWZ6.jpg);
            background-repeat: no-repeat;
            background-position: center top;
        }
    </style>
</head>
<body>
<div>

    <table id="buttons" class="table table-hover">
        <tr>
            <th>
                <button class="btn btn-info btn-lg" type="button" data-toggle="modal" data-target="#myModal">Создать
                    чат
                </button>
            </th>
            <th><p>${fullname}</p></th>
            <th><input type="submit" class="btn btn-danger" onclick="location.pathname = '/first'" name="goToFirstPage"
                       value="Выйти"></th>
        </tr>
    </table>
    <div class="tableFilms" align="center">
        <%
            Map chatters = new Chat().getChatters();
            if (!chatters.isEmpty()) {
        %>
        <table id="films" class="table table-bordered">
            <tr>
                <th>НАЗВАНИЕ</th>
                <th></th>
            </tr>
            <c:forEach var="chat" items="${chat} ">
                <tr>
                    <td><c:out value="${chat.getName()}"/></td>
                    <input type="submit" name="chatRoom" value="зайти">
                </tr>
            </c:forEach>
        </table>
        <%
            }
        %>
    </div>

    <div id="myModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button class="close" type="button" data-dismiss="modal">×</button>
                    <h4 class="modal-title">Добавление новой беседы </h4>
                </div>

                <div class="modal-body">
                    <form action="addChat" method="post">
                        <input type="text" name="nameChat" value="Название"
                               onBlur="if(this.value=='')this.value='Название'"
                               onFocus="if(this.value=='Название')this.value='' ">
                        <th><input type="submit" class="btn btn-primary" name="addChat" value="Создать"></th>
                        <input type="hidden" name="name" value="${fullname}">
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
