package br.com.eduardo.mercadinho.ini;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.eduardo.mercadinho.dao.ProdutoDAO;
import br.com.eduardo.mercadinho.dao.UsuarioDAO;
import br.com.eduardo.mercadinho.domain.ListaDeCompra;

public class Menu extends Compra {
	

	public static void menuIncial() {
		opcoesInicial();
		
		
	}
	
	public static void opcoesInicial() {
		String opcMenuInicial = JOptionPane.showInputDialog("Digite a Opção \n (P) Produtos \n (F) Perfil");
		char opc_ini = opcMenuInicial.charAt(0);
		if ((opc_ini == 'P') || (opc_ini == 'p')) {
			listarProdutos();
		}else if((opc_ini == 'S') || (opc_ini == 's')) {
			sair();
		}else if((opc_ini == 'F') || (opc_ini == 'f')) {
			perfil();
		}else {
			JOptionPane.showMessageDialog(null, "Opção inválida");
			menuIncial();
		}
	}
	
	public static void listarProdutos() {
		
//		Produtos produtos = new Produtos();
//		JOptionPane.showMessageDialog(null, produtos.listaProdutos());
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		String opc = JOptionPane.showInputDialog(null, produtoDAO.listarProdutos()+"\n (1) Comprar \n (2) Voltar");
		int opcEsc = Integer.parseInt(opc);
		if(opcEsc == 1) {
			compra();
		}else if(opcEsc == 2) {
			opcoesInicial();
		}else {
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
	}
	
public static void listarProdutosCompra() {
		
		Produtos produtos = new Produtos();
		String teste = produtos.listaProdutos();
		JOptionPane.showInputDialog("teste: "+teste);
		
	}
	
	public static void sair() {
		System.out.println("Você escolheu sair");
		System.exit(0);
	}
	
	public static void perfil() {
		System.out.println("Em manutenção");
	}
	
	public static void opc1()  {
		System.out.println("(C) - Comprar");
		System.out.println("(V) - Voltar");
		System.out.println("(S) - Sair");
		Scanner scanner = new Scanner(System.in);
		String opc1 = scanner.nextLine();
		if((opc1 == "C")||(opc1 == "c")) {
			compra();
			;
		}else if((opc1 == "V")||(opc1 == "v")) {
			menuIncial();
			
		}
		else if((opc1 == "S")||(opc1 == "s")) {
			sair();
		}
	}
	
	public static void compra(){
			ProdutoDAO produtoDAO = new ProdutoDAO();
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			
			String opcCod = JOptionPane.showInputDialog(produtoDAO.listarProdutos()+"\n Digite o código do produto que deseja comprar");
			String opcQtd = JOptionPane.showInputDialog("Digite a quantidade");
			
			int cod = Integer.parseInt(opcCod);
			int qtd = Integer.parseInt(opcQtd);
			
			produtoDAO.comprarProduto(cod);
			
			int confComp = JOptionPane.showConfirmDialog(null, "Confirmar Compra?");
			
	}
}
