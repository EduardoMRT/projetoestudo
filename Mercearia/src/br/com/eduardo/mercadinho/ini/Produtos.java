package br.com.eduardo.mercadinho.ini;

import br.com.eduardo.mercadinho.domain.Produto;
import br.com.eduardo.mercadinho.teste.TesteProduto;

public class Produtos {

	public String listaProdutos() {
		TesteProduto testeProduto = new TesteProduto();
		Produto cocaCola = testeProduto.getRefrigerante();
		Produto salgadinho = testeProduto.getSalgadinho();

		Produto[] produtos = new Produto[10];

		produtos[1] = salgadinho;
		produtos[2] = cocaCola;
		
		for (int x = 1; x <= 2; x++) {
			System.out.println("/n"+x+" - "+produtos[x].getNomeProduto()+" - "+produtos[x].getPrecoProduto());
			return "\n"+x+" - "+produtos[x].getNomeProduto()+" - "+produtos[x].getPrecoProduto();
		}
		
		return "Não há produtos";
	}

}
