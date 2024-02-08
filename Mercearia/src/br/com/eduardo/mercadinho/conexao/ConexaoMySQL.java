package br.com.eduardo.mercadinho.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
	
	
	private static final String url = "jdbc:mysql://localhost:3306/mercearia";
	private static final String user = "root";
	public static final String password = "admin";

	private static Connection conn;

	public static Connection getConnection() {

		try {
			if (conn == null) {
				conn = DriverManager.getConnection(url, user, password);
				return conn;
			} else {
				return conn;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}