package classes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import dao.PessoaDAO;

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
	
}
