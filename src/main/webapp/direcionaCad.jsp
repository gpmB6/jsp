<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="classes.Usuario"%>
<%@page errorPage="paginaErro.jsp"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Confirmação de Cadastro de Pessoa</title>
    </head>
    <body>    
        <jsp:useBean id="pessoaBean" class="classes.Usuario" scope="request"/>
        <jsp:setProperty name="pessoaBean" property="*" /> 
        <%
            if (pessoaBean.salvar()) {
        %>
         <jsp:forward page="cadSucesso.jsp"/>
        <%
        } else {%>
          <jsp:forward page="mostrarErro.jsp"/>
        <%}%>
    </body>
</html>
