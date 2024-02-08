package br.com.eduardo.mercadinho.domain;

import java.math.BigDecimal;

public class Produto {
	private String nomeProduto;
	private BigDecimal precoProduto;
	private int quantidadeProduto;
	private String descricaoProduto;
	private int idProduto;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public BigDecimal getPrecoProduto() {
		return precoProduto;
	}
	
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public int getIdProduto() {
		return idProduto;
	}
	
	public Produto(int idProduto, String nomeProduto, BigDecimal precoProduto, int quantidadeProduto, String descricaoProduto) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.descricaoProduto = descricaoProduto;
	}
	
	
}
