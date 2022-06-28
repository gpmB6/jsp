package classes;

/*
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
*/

import dao.UsuarioDAO;
import classes.Usuario;

public class LoginManaged {

/*	@ManagedBean(name = "LoginMB")
	@ViewScoped */
	public class LoginManagedBean {

	    private UsuarioDAO usuarioDAO = new UsuarioDAO();
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

	    public UsuarioDAO getUsuarioDAO() {
	        return usuarioDAO;
	    }

	    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
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
