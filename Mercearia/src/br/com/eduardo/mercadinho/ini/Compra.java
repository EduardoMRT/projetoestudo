package br.com.eduardo.mercadinho.ini;

import br.com.eduardo.mercadinho.domain.Registrar;

public class Compra {
	
	public static void main(String[] args) {
		 System.out.println("Bem vindo a Mercearia JAVA");
		 System.out.println("Você precisa fazer o seu cadastro");
		 Registrar registrar = new Registrar();
		 registrar.registrarUsuario();
		 Menu menu = new Menu();
		 Produtos produtos = new Produtos();
		 //produtos.listaProdutos();
		 Menu.menuIncial();
		 
	}
	
	
}
