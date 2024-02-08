package br.com.eduardo.mercadinho.domain;

public class Cliente {
	private int idCliente;
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
	
	public int getIdCliente() {
		return idCliente;
	}
	
	
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cliente(int idCliente, String nome, int idade, String endereco, String cpf) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.cpf = cpf;
	}

	
	
}
