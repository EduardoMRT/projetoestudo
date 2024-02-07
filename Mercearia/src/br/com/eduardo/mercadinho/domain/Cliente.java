package br.com.eduardo.mercadinho.domain;

public class Cliente {
	private String nome;
	private int idade;
	private String endereco;
	private String cpf;
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public Cliente(String nome, int idade, String endereco, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.cpf = cpf;
	}

	
	
}
