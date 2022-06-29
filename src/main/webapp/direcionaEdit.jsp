<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="classes.*"%>
<%@page errorPage="paginaErro.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Confirmação de Edição</title>
    </head>
    <body>    
        <jsp:useBean id="pessoaBean" class="classes.Pessoa" scope="request"/>
        <jsp:setProperty name="pessoaBean" property="*" /> 
        <%
           	  if (pessoaBean.atualizar()){
         %>
            <jsp:forward page="listarColaboradores.jsp"/>
        <%}else {%>
             <jsp:forward page="mostrarErro.jsp"/>
        <%}%>
    </body>
</html>
