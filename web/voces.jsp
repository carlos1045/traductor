<%-- 
    Document   : voces
    Created on : 18/11/2014, 03:45:08 PM
    Author     : Neider Mejia Ciro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>voz</title>
    </head>
    <body>
        <h1>palabras</h1>
        
        <%
        HttpSession menu = request.getSession();
        String recibido = String.valueOf(menu.getAttribute("texto")).toUpperCase();
        %>
        
        <%=recibido%>
    </body>
</html>
