package br.com.eduardo.mercadinho.teste;
import br.com.eduardo.mercadinho.domain.Cliente;
import br.com.eduardo.mercadinho.verificacao.VerificaCliente;

public class TesteCliente {
	public static void main(String[] args) {
		Cliente maria = new Cliente("Teste", 17, "Endereço Teste", "123456");
		Cliente joao = new Cliente("Teste", 18, "Endereço Teste", "123456");
		
		VerificaCliente verificaCliente = new VerificaCliente();
		
	    String verificado = verificaCliente.verifica(joao);
	    System.out.println(verificado);
	    
	}
}
