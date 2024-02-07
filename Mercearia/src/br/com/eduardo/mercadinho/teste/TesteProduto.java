package br.com.eduardo.mercadinho.teste;

import java.math.BigDecimal;

import br.com.eduardo.mercadinho.domain.Produto;
import br.eduardo.mercadinho.verificageral.VerificaGeral;

public class TesteProduto {
	Produto salgadinho = new Produto("Ruffles", new BigDecimal("9.99"), 10, "Ruffles tamanho médio");
	Produto refrigerante = new Produto("Coca Cola", new BigDecimal("4.99"), 7, "Coca Cola 350ml");
	
	public Produto getSalgadinho() {
		return salgadinho;
	}
	
	public Produto getRefrigerante() {
		return refrigerante;
	}
	
	VerificaGeral verificaGeral = new VerificaGeral();
	String verificado = verificaGeral.verificarProduto(salgadinho);
	
}
