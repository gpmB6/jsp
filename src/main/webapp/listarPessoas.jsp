<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.*"%>
<%@page import="classes.*"%>
<%@page errorPage="paginaErro.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <jsp:useBean id="pessoaBean" class="classes.Usuario" scope="request"/>
    <%
    List<Usuario> lista=pessoaBean.buscarTodos();  
            request.setAttribute("listaReq",lista);
    %>  
    <table border="1">
      <c:forEach var="pessoa" items="${listaReq}">
    	<tr>
           <td>${pessoa.getNome()}</td>
           <td>${pessoa.getEndereco()}</td>
   	   	   <td><a href="excluirPessoa.jsp?idPessoa=${pessoa.getIdPessoa()}"> Excluir </a></td>
   	   	   <td><a href="editarPessoa.jsp?idPessoa=${pessoa.getIdPessoa()}"> Editar </a></td>
    	</tr>
      </c:forEach>
    </table>
</body>
</html>