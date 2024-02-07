package br.com.eduardo.mercadinho.ini;

import java.util.Scanner;

import br.com.eduardo.mercadinho.domain.Cliente;
import br.eduardo.mercadinho.verificageral.VerificaGeral;

public class Compra {
	
	public static void main(String[] args) {
		 System.out.println("Bem vindo a Mercearia JAVA");
		 System.out.println("Você precisa fazer o seu cadastro");
		 registrar(); 
		 Menu menu = new Menu();
		 Produtos produtos = new Produtos();
		 //produtos.listaProdutos();
		 menu.menuIncial();
		 
	}
	
	private static void registrar() {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Por favor, para acessar ao sistema, digite o seu nome");
		 String nomeDigitado = scanner.next();
		 System.out.println("Digite a sua idade:");
		 int idadeDigitada = scanner.nextInt();
		 System.out.println("Digite o seu endereço");
		 String enderecoDigitado = scanner.next();
		 System.out.println("Digite o seu CPF");
		 String cpfDigitado = scanner.next();
		 String nomeCliente = nomeDigitado;
		
		 Cliente user = new Cliente(nomeCliente, idadeDigitada, enderecoDigitado, cpfDigitado);
		 VerificaGeral verificaGeral = new VerificaGeral();
		 verificaGeral.verificarCliente(user);
		 
	}
}
