package classes;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import dao.PessoaDAO;

@Entity
@Table(name="pessoas") 

@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 3,
discriminatorType = DiscriminatorType.STRING)
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idPessoa")
	private long idPessoa;
	
	@Column(name = "nome", updatable = false)
	private String nome;
	
	@Column(name = "endereco", updatable = false)
	private String endereco;	
	
	public Pessoa() {
		
	}
	
	public Pessoa(long idPessoa, String nome, String endereco) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + idPessoa + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	public boolean salvar() {
		return new PessoaDAO().salvar(this);
	}
	
	public List<Pessoa> buscarTodos(){
		return new PessoaDAO().buscarTodos();
	}
	
	public boolean atualizar(){
		return new PessoaDAO().atualizar(this);
	}
	
	public boolean remover(){
		return new PessoaDAO().remover(this.getIdPessoa());
	}
	
	public Pessoa buscarID(){
		return new PessoaDAO().buscarID(this.getIdPessoa());
	}

}
