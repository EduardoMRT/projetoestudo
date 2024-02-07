package br.com.eduardo.mercadinho.ini;

import java.util.Scanner;

import br.com.eduardo.mercadinho.domain.Cliente;
import br.com.eduardo.mercadinho.domain.Produto;
import br.com.eduardo.mercadinho.teste.TesteProduto;
import br.eduardo.mercadinho.verificageral.VerificaGeral;

public class Compra {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Bem vindo a Mercearia JAVA");
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
		 
		 TesteProduto testeProduto = new TesteProduto();
		 Produto salgadinho = testeProduto.getSalgadinho();
		 
		 System.out.println(salgadinho.getNomeProduto());
		 
	}
}
