package br.com.eduardo.mercadinho.domain;

import javax.swing.JOptionPane;

import br.com.eduardo.mercadinho.dao.UsuarioDAO;
import br.eduardo.mercadinho.verificageral.VerificaGeral;

public class Registrar {
	public void registrarUsuario() {
		
		String codigo = JOptionPane.showInputDialog("ID:");
		int idUsuario = Integer.parseInt(codigo); 
		 
		 String nomeDigitado = JOptionPane.showInputDialog("Digite o seu nome");
		 String idade = JOptionPane.showInputDialog("Digite a sua idade");
		 int idadeDigitada = Integer.parseInt(idade);
		 String enderecoDigitado = JOptionPane.showInputDialog("Digite o seu endereço");
		 String cpfDigitado = JOptionPane.showInputDialog("Digite o seu CPF");
		 String nomeCliente = nomeDigitado;
		
		 Cliente user = new Cliente(idUsuario, nomeCliente, idadeDigitada, enderecoDigitado, cpfDigitado);
		 VerificaGeral verificaGeral = new VerificaGeral();
		 verificaGeral.verificarCliente(user);
		 
		 
		 UsuarioDAO usuarioDAO = new UsuarioDAO();
		 usuarioDAO.registrarUsuario(user);
	}
}
