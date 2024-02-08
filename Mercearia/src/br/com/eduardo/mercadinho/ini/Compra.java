package br.com.eduardo.mercadinho.ini;

import javax.swing.JOptionPane;

import br.com.eduardo.mercadinho.conexao.ConexaoMySQL;
import br.com.eduardo.mercadinho.domain.Registrar;

public class Compra {
	
	public static void main(String[] args) {
		 JOptionPane.showMessageDialog(null, "Bem vindo a Mercearia JAVA");
		 JOptionPane.showMessageDialog(null, "Você precisa fazer o seu cadastro");
		 Registrar registrar = new Registrar();
		 registrar.registrarUsuario();
		 //Menu menu = new Menu();
		 //Produtos produtos = new Produtos();
		 //produtos.listaProdutos();
		 Menu.menuIncial();
		 
		 ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
		 conexaoMySQL.conectaDB();
	}
	
	
}
