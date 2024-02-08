package br.com.eduardo.mercadinho.teste;
import br.com.eduardo.mercadinho.domain.Cliente;
import br.com.eduardo.mercadinho.verificacao.VerificaCliente;

public class TesteCliente {
		Cliente maria = new Cliente(1, "Teste", 17, "Endereço Teste", "123456");
		Cliente joao = new Cliente(2, "Teste", 18, "Endereço Teste", "123456");
		
		VerificaCliente verificaCliente = new VerificaCliente();
}
