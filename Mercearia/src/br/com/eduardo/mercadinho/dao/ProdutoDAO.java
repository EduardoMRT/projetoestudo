package br.com.eduardo.mercadinho.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.eduardo.mercadinho.conexao.ConexaoMySQL;
import br.com.eduardo.mercadinho.ini.Compra;

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
				int idProd = rs.getInt("idproduto");
				//String descricao = rs.getString("descricaoProuto");
				
				String produto = "\n ------------- \nCódigo: "+idProd+"\nProduto: "+nome+"\nValor: R$"+valor+"\nQuantidade:"+quantidade+"\n --------------";
				produtos = produtos+" "+produto;
				//System.out.println(descricao);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		return produtos;
	}
	
	public void comprarProduto(int cod) {
		try {
			java.sql.Statement stmt = conectaDB().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM produtos WHERE idproduto = '"+cod+"'");
			
			while (rs.next()) {
				String nome = rs.getString("nomeProduto");
				double valor = rs.getDouble("precoProduto");
				int quantidade = rs.getInt("quantidadeProduto");
				int idProd = rs.getInt("idproduto");
				System.out.println(nome);
				diminuirEstoque();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
	
//	public void diminuirEstoque() {
//		try {
//			java.sql.Statement stmt = conectaDB().createStatement();
//			ResultSet rs = stmt.executeUpdate("UPDATE produtos SET quantidadeProduto =");
//			
//			while (rs.next()) {
//				String nome = rs.getString("nomeProduto");
//				double valor = rs.getDouble("precoProduto");
//				int quantidade = rs.getInt("quantidadeProduto");
//				int idProd = rs.getInt("idproduto");
//				System.out.println(nome);
//				diminuirEstoque();
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//	}
//	}
}
