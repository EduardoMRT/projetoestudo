package br.com.eduardo.mercadinho.verificacao;

import br.com.eduardo.mercadinho.domain.Cliente;

public class VerificaCliente {
	
	public boolean verifica(Cliente cliente) {
		int idade = cliente.getIdade();
			if(idade < 18) {
				System.out.println("O cliente "+cliente.getNome()+" não pode ser criado, por ser menor de idade");
				System.exit(0);
				return false;
			}else {
				System.out.println("Cliente criado com sucesso!");
				return true;
			}		
	}
}
