<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="classes.*"%>
<%@page errorPage="paginaErro.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Editar Colaborador</title>
    </head>
    <body>
     <jsp:useBean id="pessoaBean" class="classes.Usuario" scope="request"/>
     <jsp:setProperty name="pessoaBean" property="idPessoa" param="idPessoa" />
        <%
        Usuario pessoa = pessoaBean.buscarID(); 
                String id = String.valueOf(pessoaBean.getIdUsuario());
        %>  
    
        <h1>Editar Usuário</h1>
        <form method ="POST" action="direcionaEdit.jsp">
        <input type="hidden" name="idPessoa" value="<%=id%>"/>  
            <p>
                Nome:    <br/>
                <input type="text" name="nome" value="<%=pessoa.getNome()%>">
            </p>
            <p>
                Endereço: <br/>
                <!-- <input type="text" name="endereco" value="<%=pessoa.getEndereco()%>">  -->
            </p>
      
 
            <p>
                <input type="submit" value="OK">
            </p>
            <p>
                <input type="reset" value="Limpar">
            </p>
        </form> 
    </body>
</html>

