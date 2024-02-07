package br.com.eduardo.mercadinho.verificacao;

import br.com.eduardo.mercadinho.domain.Produto;
import br.eduardo.mercadinho.verificageral.VerificaGeral;

public class VerificaProduto extends VerificaGeral{
	public  String verificarProduto(Produto produto) {
		int quantidade = produto.getQuantidadeProduto();
			if(quantidade <= 0) {
				System.out.println("O produto não está em estoque");
			}else {
				System.out.println("O produto está disponível para compra!");
			}
		return null;
	}
}
