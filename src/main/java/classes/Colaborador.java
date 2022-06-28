package classes;
import java.io.Serializable;

import classes.Pessoa;

public class Colaborador extends Pessoa {
	
	private String cpf;
	private String tituloEleitor;
	private boolean reservista;
	private String email;
	private double salario;
	
	public Colaborador(long idPessoa, String nome, String endereco, String cpf, String tituloEleitor, boolean reservista, String email, double salario) {
        super(idPessoa, nome, endereco);
		this.cpf = cpf;
		this.tituloEleitor = tituloEleitor;
		this.reservista = reservista;
		this.email = email;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTituloEleitor() {
		return tituloEleitor;
	}
	
	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	
	public boolean isReservista() {
		return reservista;
	}
	
	public void setReservista(boolean reservista) {
		this.reservista = reservista;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
    public String toString() {
		return "" +super.toString() +", cpf=" + cpf + ", tituloEleitor=" + tituloEleitor + ", reservista=" + reservista
				+ ", email=" + email + ", salario=" + salario + "]";
	}
	
	
	
}
