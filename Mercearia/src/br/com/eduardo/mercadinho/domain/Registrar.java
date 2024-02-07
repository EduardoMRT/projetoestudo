package br.com.eduardo.mercadinho.domain;

import java.util.Scanner;

import br.eduardo.mercadinho.verificageral.VerificaGeral;

public class Registrar {
	private static void registrar() {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Por favor, para acessar ao sistema, digite o seu nome");
		 String nomeDigitado = scanner.nextLine();
		 System.out.println("Digite a sua idade:");
		 int idadeDigitada = scanner.nextInt();
		 System.out.println("Digite o seu endereço");
		 String enderecoDigitado = scanner.nextLine();
		 System.out.println("Digite o seu CPF");
		 String cpfDigitado = scanner.nextLine();
		 System.out.println("---------------------");
		 String nomeCliente = nomeDigitado;
		
		 Cliente user = new Cliente(nomeCliente, idadeDigitada, enderecoDigitado, cpfDigitado);
		 VerificaGeral verificaGeral = new VerificaGeral();
		 verificaGeral.verificarCliente(user);
		 
	}
}
