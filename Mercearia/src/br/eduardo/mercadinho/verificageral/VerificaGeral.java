package br.eduardo.mercadinho.verificageral;

import br.com.eduardo.mercadinho.domain.Cliente;
import br.com.eduardo.mercadinho.domain.Produto;
import br.com.eduardo.mercadinho.verificacao.VerificaCliente;
import br.com.eduardo.mercadinho.verificacao.VerificaProduto;

public class VerificaGeral{
	//produto
	public String verificarProduto(Produto produto) {
	VerificaProduto verificaProduto = new VerificaProduto();
	verificaProduto.verificarProduto(produto);
	
	return "Passou";

	}
	
	//cliente
	public String verificarCliente(Cliente cliente) {
	VerificaCliente verificaCliente = new VerificaCliente();
	verificaCliente.verifica(cliente);
	
	return "OK";
	}
}
