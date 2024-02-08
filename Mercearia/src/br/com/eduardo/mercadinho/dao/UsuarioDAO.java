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
		String sql = "INSERT INTO usuarios (nome, idade, endereco, cpf) VALUES (?, ?, ?, ?)";
		
		PreparedStatement ps = null;
		try {
			java.sql.Statement stmt = conectaDB().createStatement();
			int rs = stmt.executeUpdate("INSERT INTO usuarios (nome, idade, endereco, cpf) VALUES ('cliente.getNome()','cliente.getIdade()','cliente.getEndereco()','cliente.getCpf()'))");
			System.out.println("entrou");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
