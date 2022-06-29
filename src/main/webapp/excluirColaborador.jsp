<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="classes.*"%>
<%@page errorPage="paginaErro.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remover Colaborador</title>
</head>
<body>
    <jsp:useBean id="pessoaBean" class="classes.Pessoa" scope="request"/>
    <jsp:setProperty name="pessoaBean" property="idPessoa" param="idPessoa" />
	<%
			if(pessoaBean.remover()){
 	%>
	     <jsp:forward page="listarPessoas.jsp"/>
     <%
        } else {
                out.println("<br/>Erro ao excluir colaborador!");
                out.println("<br/><a href=listarColaboradores.jsp> Voltar para a lista </a>");
        }
      %>
</body>
</html>