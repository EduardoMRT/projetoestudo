package br.com.eduardo.mercadinho.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class ConexaoMySQL {
	
public  Connection conectaDB(){
	Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/mercearia?user=root&password=admin";
			conn = DriverManager.getConnection(url);
			System.out.println(url);
	
			java.sql.Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");
			while (rs.next()) {
			String nome = rs.getString("nome");
			System.out.println(nome);
			
			return conn;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		//System.out.println("entrou no conn class");
		return conn;
	}

//public static void main(String[] args) {
//	conectaDB();
//}

}