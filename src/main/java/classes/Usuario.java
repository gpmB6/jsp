package classes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import dao.UsuarioDAO;

@Entity
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	private String nome;
	private String senha;

	public Usuario(){
		
	}
	
	public Usuario(Long idUsuario, String nome, String senha) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){ 
		this.nome = nome; 
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", senha=" + senha + "]" + idUsuario;
	}
	
	public boolean salvar() {
		return new UsuarioDAO().salvar(this);
	}
	
	public List<Usuario> buscarTodos(){
		return new UsuarioDAO().buscarTodos();
	}
	
	public boolean atualizar(){
		return new UsuarioDAO().atualizar(this);
	}
	
	public boolean remover(){
		return new UsuarioDAO().remover(this.getIdUsuario());
	}
	
	public Usuario buscarID(){
		return new UsuarioDAO().buscarID(this.getIdUsuario());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
}
