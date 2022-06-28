<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Menu</title>
	</head>

<body>

	<div align="center">
				<h3>MENU</h3>
				
					<table style="with: 100%">
						
						<tr>	
   	   	   					<td>
   	   	   						<a href="adicionarColaborador.jsp?idPessoa=${pessoa.getIdPessoa()}"> 
   	   	   						Cadastrar Colaborador </a>
   	   	   					</td>
						</tr>

						<tr>
							<td>
								<a href="listarColaboradoresTudo.jsp?idPessoa=${pessoa.getIdPessoa()}"> 
								Listar Todos os Colaboradores</a>
							</td>
						</tr>
						
						<tr>
							<td>
								<a href="listarColaboradores.jsp?idPessoa=${pessoa.getIdPessoa()}"> 
								Listar Informações Seletivos de Todos os Colaboradores</a>
							</td>
						</tr>
						
						<tr>	
   	   	   					<td>
   	   	   						<a href="editarColaborador.jsp?idPessoa=${pessoa.getIdPessoa()}"> 
   	   	   						Editar Colaborador </a>
   	   	   					</td>
						</tr>

						<tr>
							<td>
								<a href="excluirColaborador.jsp?idPessoa=${pessoa.getIdPessoa()}"> 
								Excluir Colaborador</a>
							</td>
						</tr>

		
					</table>
					

				</form>
		</div>       


</body>
</html>