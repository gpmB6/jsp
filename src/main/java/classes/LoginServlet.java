package classes;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import classes.Usuario;
import dao.PessoaDAO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PessoaDAO usuarioDAO;

	public void init() {
		usuarioDAO = new PessoaDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setSenha(senha);

		try {
			if (usuarioDAO.validate(usuario)) {
				response.sendRedirect("loginsuccess.jsp");
			} else {
				HttpSession session = request.getSession();
				response.sendRedirect("paginaErro.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
