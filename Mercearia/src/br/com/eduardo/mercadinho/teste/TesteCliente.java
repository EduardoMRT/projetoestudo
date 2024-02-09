package br.com.eduardo.mercadinho.teste;
import javax.swing.JOptionPane;

import br.com.eduardo.mercadinho.domain.Cliente;
import br.com.eduardo.mercadinho.verificacao.VerificaCliente;

public class TesteCliente {
		Cliente maria = new Cliente("Teste", 17, "Endereço Teste", "123456","teste2");
		Cliente joao = new Cliente("Teste", 18, "Endereço Teste", "123456","teste2");
		
		VerificaCliente verificaCliente = new VerificaCliente();

//		public static void main(String[] args) {
//			 Object[] options = { "Produtos", "Meu perfil" };
//			 int opc = JOptionPane.showMessageDialog(null, "Página Inicial", null, 0, 0, JOptionPane.INFORMATION_MESSAGE, options, options[0]);
//			 
//			System.out.println(opc);
//			
//		}
}

