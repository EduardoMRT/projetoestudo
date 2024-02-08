package br.com.eduardo.mercadinho.verificacao;

import javax.swing.JOptionPane;

import br.com.eduardo.mercadinho.domain.Cliente;

public class VerificaCliente {
	
	public boolean verifica(Cliente cliente) {
		int idade = cliente.getIdade();
			if(idade < 18) {
				JOptionPane.showMessageDialog(null, "O cliente "+cliente.getNome()+" não pode ser criado, por ser menor de idade");
				System.exit(0);
				return false;
			}else {
				JOptionPane.showMessageDialog(null, "Cliente criado com sucesso!");
				return true;
			}		
	}
}
