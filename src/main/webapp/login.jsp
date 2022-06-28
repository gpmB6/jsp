<%@page import="classes.Usuario" %>
<%@page import="dao.UsuarioDAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="paginaErro.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validação</title>
    </head>
    <body>    
        <jsp:useBean id="usuarioBean" class="classes.Usuario" scope="request"/>
        <jsp:setProperty name="usuarioBean" property="*" /> 
        <%
            if (UsuarioDAO.validate()) {
        %>
        <jsp:forward page = "Mensagem.jsp" > 
            <jsp:param name = "nome" value = "<%=usuarioBean.getNome()%>" /> 
            <jsp:param name = "senha" value = "<%=usuarioBean.getSenha()%>" /> 
        </jsp:forward>
        <%
        } else {
                out.println("<br/>Login Inválido!");
                out.println("<br/><a href =index.html> Tentar novamente</a>");
        }
        %>
    </body>
</html>