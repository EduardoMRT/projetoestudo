package br.com.eduardo.mercadinho.ini;

import java.util.Scanner;

public class Menu extends Compra {
	Scanner scanner = new Scanner(System.in);

	public void menuIncial() {

		System.out.println("1 - Produtos");
		System.out.println("2 - Sair");
		System.out.println("3 - Perfil");
		
		opcoesInicial();
		
	}
	
	public static void opcoesInicial() {
		Scanner scanner = new Scanner(System.in);
		int opcMenuInicial = scanner.nextInt();
		if (opcMenuInicial == 1) {
			listarProdutos();
		}else if(opcMenuInicial == 2) {
			sair();
		}else if(opcMenuInicial == 3) {
			perfil();
		}else {
			System.out.println("Opção inválida");
			
		}
	}
	
	public static void listarProdutos() {
		Produtos produtos = new Produtos();
		produtos.listaProdutos();
	}
	
	public static void sair() {
		System.out.println("Você escolheu sair");
		System.exit(0);
	}
	
	public static void perfil() {
		System.out.println("Em manutenção");
	}
}
