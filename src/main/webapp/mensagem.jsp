<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="PaginaErro.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <jsp:useBean id="usuarioBean" class="classes.Usuario" scope="request"/>
        <jsp:setProperty name="usuarioBean" property="nome" param="nome" />
        <jsp:setProperty name="usuarioBean" property="senha" param="senha" />
        <h1>
            O login <jsp:getProperty name="usuarioBean" property="nome" />  
            - <jsp:getProperty name="usuarioBean" property="senha" /> é válido!
        </h1>

    </body>
</html>

