package br.com.eduardo.mercadinho.verificacao;

import br.com.eduardo.mercadinho.domain.Cliente;

public class VerificaCliente {
	
	public String verifica(Cliente cliente) {
		int idade = cliente.getIdade();
			if(idade < 18) {
				return "O cliente "+cliente.getNome()+" não pode ser criado, por ser menor de idade";

			}else {
				return "Cliente Maior de Idade? [OK]";
			}
			
	}
}
