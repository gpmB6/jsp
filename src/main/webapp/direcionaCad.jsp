<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="classes.Pessoa"%>
<%@page errorPage="paginaErro.jsp"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Confirma��o de Cadastro de Colaborador</title>
    </head>
    <body>    
        <jsp:useBean id="pessoaBean" class="classes.Pessoa" scope="request"/>
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
