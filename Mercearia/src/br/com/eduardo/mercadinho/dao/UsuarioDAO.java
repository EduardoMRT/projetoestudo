package br.com.eduardo.mercadinho.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.eduardo.mercadinho.conexao.ConexaoMySQL;
import br.com.eduardo.mercadinho.domain.Cliente;

public class UsuarioDAO {

	public void registrarUsuario(Cliente cliente) {
		String sql = "INSERT INTO usuarios (nome, idade, endereco, cpf) VALUES (?, ?, ?, ?)";

		PreparedStatement ps = null;
		try {
			ps = ConexaoMySQL.getConnection().prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setInt(2, cliente.getIdade());
			ps.setString(3, cliente.getEndereco());
			ps.setString(4, cliente.getCpf());
			
			ps.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
