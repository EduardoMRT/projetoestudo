package br.com.eduardo.mercadinho.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.eduardo.mercadinho.conexao.ConexaoMySQL;

public class ProdutoDAO extends ConexaoMySQL{
	public String listarProdutos() {
		PreparedStatement ps = null;
		String produtos = "Lista de Produtos:";
		try {
			java.sql.Statement stmt = conectaDB().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM produtos");
			
			while (rs.next()) {
				String nome = rs.getString("nomeProduto");
				double valor = rs.getDouble("precoProduto");
				int quantidade = rs.getInt("quantidadeProduto");
				//String descricao = rs.getString("descricaoProuto");
				
				String produto = "\n Produto: "+nome+" - Valor: "+valor+" Quantidade:"+quantidade;
				produtos = produtos+" "+produto;
				//System.out.println(descricao);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		return produtos;
	}
}
