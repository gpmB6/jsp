package classes;
import java.io.Serializable;

import javax.persistence.*;

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
	

}
