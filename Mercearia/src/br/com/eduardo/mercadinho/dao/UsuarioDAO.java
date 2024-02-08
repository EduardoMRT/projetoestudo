package br.com.eduardo.mercadinho.dao;

import java.sql.PreparedStatement;
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
			ps = conectaDB().prepareStatement("INSERT INTO usuarios VALUES (?, ?, ?, ?)");
			ps.setString(1, cliente.getNome());
			ps.setInt(2, cliente.getIdade());
			ps.setString(3, cliente.getEndereco());
			ps.setString(4, cliente.getCpf());
			
			ps.addBatch();
			System.out.println("Passou 2");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
