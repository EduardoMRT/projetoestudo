package br.com.eduardo.mercadinho.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.eduardo.mercadinho.conexao.ConexaoMySQL;
import br.com.eduardo.mercadinho.domain.Cliente;

public class UsuarioDAO extends ConexaoMySQL{

	public void registrarUsuario(Cliente cliente) {
//		ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
//		conexaoMySQL.conectaDB();
		//String sql = "INSERT INTO usuarios (nome, idade, endereco, cpf) VALUES (?, ?, ?, ?)";
		
		PreparedStatement ps = null;
		try {
			int idade = cliente.getIdade();
			String cpf = cliente.getCpf();
			String senha = cliente.getSenha();
			java.sql.Statement stmt = conectaDB().createStatement();
			int rs = stmt.executeUpdate("INSERT INTO usuarios (nome, idade, endereco, cpf, senha) VALUES ('"+cliente.getNome()+"',"+idade+",'"+cliente.getEndereco()+"','"+cpf+"','"+senha+"')");
			System.out.println("entrou");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void listarUsuarios() {
		try {
			java.sql.Statement stmt = conectaDB().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT nome FROM usuarios");
			System.out.println("Lista de Usuários");
			
			while (rs.next()) {
				String nome = rs.getString("nome");
				System.out.println(nome);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}

}
}
