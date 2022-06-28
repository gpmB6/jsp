package classes;

/*
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
*/

import dao.PessoaDAO;
import classes.Usuario;

public class LoginManaged {

/*	@ManagedBean(name = "LoginMB")
	@ViewScoped */
	public class LoginManagedBean {

	    private PessoaDAO usuarioDAO = new PessoaDAO();
	    private Usuario usuario = new Usuario();

	    public String envia() {

	        usuario = usuarioDAO.getUsuario(usuario.getNome(), usuario.getSenha());
	          if (usuario == null) {
	              usuario = new Usuario();
	            /*    FacesContext.getCurrentInstance().addMessage(
	                           null,
	                           new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login ou senha invalidos",
	                                       "Erro no Login!"));*/
	                return null;
	          } else {
	                return "/main";
	          }


	    }

	    public PessoaDAO getUsuarioDAO() {
	        return usuarioDAO;
	    }

	    public void setUsuarioDAO(PessoaDAO usuarioDAO) {
	        this.usuarioDAO = usuarioDAO;
	    }

	    public Usuario getUsuario() {
	        return usuario;
	    }

	    public void setUsuario(Usuario usuario) {
	        this.usuario = usuario;
	    }

	}
	
}
