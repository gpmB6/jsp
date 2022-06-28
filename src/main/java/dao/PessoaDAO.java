package dao;

import classes.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.*;


public class PessoaDAO {

	private EntityManager em;

	public PessoaDAO() {
	}

	public boolean salvar(Pessoa p) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		}
	}

	public boolean atualizar(Pessoa p) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(p);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		} 
	}

	public boolean remover(Long id) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			Pessoa entity = em.find(Pessoa.class, id);
			em.remove(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		} 
	}

	public Pessoa buscarID(Long id) {
		try {
			em = JPAUtil.getEntityManager();
			Pessoa pessoa = em.find(Pessoa.class, id);
			return pessoa;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<Pessoa> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Pessoa> query = em.createQuery("SELECT obj FROM Pessoa obj", Pessoa.class);
			List<Pessoa> pessoas = query.getResultList();
			return pessoas;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
	
	/*DAO PARA O LOGIN
	public boolean validate(Usuario usuario) throws ClassNotFoundException {
		boolean status = false;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/jsp?useSSL=false", "root", "root");

				PreparedStatement preparedStatement = connection
						.prepareStatement("select * from login where nome = ? and senha = ? ")) {
			preparedStatement.setString(1, usuario.getNome());
			preparedStatement.setString(2, usuario.getSenha());

			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			printSQLException(e);
		}
		return status;
	}*/

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
