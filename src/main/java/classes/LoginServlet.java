package classes;

import java.io.IOException;
import javax.servlet.*;

import classes.Usuario;
import dao.UsuarioDAO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDAO usuarioDAO;

	public void init() {
		usuarioDAO = new UsuarioDAO();
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
