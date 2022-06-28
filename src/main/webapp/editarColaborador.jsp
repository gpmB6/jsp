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
     <jsp:useBean id="pessoaBean" class="classes.Pessoa" scope="request"/>
     <jsp:setProperty name="pessoaBean" property="idPessoa" param="idPessoa" />
        <%  
        //Pessoa pessoa = pessoaBean.buscarID();
        String id = String.valueOf(pessoaBean.getIdPessoa());	
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
                <input type="text" name="endereco" value="<%=pessoa.getEndereco()%>">
            </p>
             <p>
                CPF: <br/>
                <input type="text" name="cpf" value="<%=pessoa.getCpf()%>">
            </p>
             <p>
                Título de Eleitor: <br/>
                <input type="text" name="tituloEleitor" value="<%=pessoa.getTituloEleitor()%>">
            </p>
             <p>
                Reservista: <br/>
                <a>Sim</a> <input type="checkbox" name="reservista" value="<%=pessoa.getReservista()%>">
                <a>Não</a> <input type="checkbox" name="naoReservista">
                
            </p>
             <p>
                Email: <br/>
                <input type="text" name="email" value="<%=pessoa.getEmail()%>">
            </p>
             <p>
                Salário: <br/>
                <input type="text" name="salario" value="<%=pessoa.getSalario()%>">
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