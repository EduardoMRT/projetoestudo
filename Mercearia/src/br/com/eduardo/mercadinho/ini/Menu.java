package br.com.eduardo.mercadinho.ini;
import java.util.Scanner;

public class Menu extends Compra {
	

	public static void menuIncial() {
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
			menuIncial();
		}
	}
	
	public static void listarProdutos() {
		Scanner scanner = new Scanner(System.in);
		Produtos produtos = new Produtos();
		produtos.listaProdutos();
		opc1();
	}
	
	public static void sair() {
		System.out.println("Você escolheu sair");
		System.exit(0);
	}
	
	public static void perfil() {
		System.out.println("Em manutenção");
	}
	
	public static void opc1()  {
		System.out.println("1 - Comprar");
		System.out.println("2 - Voltar");
		System.out.println("3 - Sair");
		Scanner scanner = new Scanner(System.in);
		int opc1 = scanner.nextInt();
		if(opc1 == 1) {
			compra();
			;
		}else if(opc1 == 2) {
			menuIncial();
			
		}
		else if(opc1 == 3) {
			sair();
		}
	}
	
	public static void compra(){
		
	}
}
