package classes;
import java.io.Serializable;

public class Pessoa {
	
	private long idPessoa;
	private String nome;
	private String endereco;	
	
	public Pessoa(long idPessoa, String nome, String endereco) {
		super();
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
	

}
