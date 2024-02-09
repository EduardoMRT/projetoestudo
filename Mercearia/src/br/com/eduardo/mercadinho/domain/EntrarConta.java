package br.com.eduardo.mercadinho.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.eduardo.mercadinho.conexao.ConexaoMySQL;
import br.com.eduardo.mercadinho.dao.UsuarioDAO;

public class EntrarConta {
	public int entrar() {
		ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		String nomeDigitado = JOptionPane.showInputDialog("Digite o seu nome");
		String senha = JOptionPane.showInputDialog("Digite a sua senha");
		
		int validado = 0;
		try {
			java.sql.Statement stmt = conexaoMySQL.conectaDB().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT senha FROM mercearia.usuarios WHERE nome = '"+nomeDigitado+"'");
			
			
			while (rs.next()) {
				String senhaBanco = rs.getString("senha");
//				System.out.println("Senha DB:"+senhaBanco);
//				System.out.println("Senha digitada:"+senha);
				if (senha.equals(senhaBanco)) {
					JOptionPane.showMessageDialog(null, "Usuário logado com sucesso!");
					validado = 1;
					return validado;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(validado == 0) {
			JOptionPane.showMessageDialog(null, "Nome ou senha incorretas!");
			System.exit(0);
		}
		return validado;
		
	}
}
