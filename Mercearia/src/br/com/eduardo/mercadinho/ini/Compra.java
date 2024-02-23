

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import br.com.eduardo.mercadinho.conexao.ConexaoMySQL;
import br.com.eduardo.mercadinho.domain.EntrarConta;
import br.com.eduardo.mercadinho.domain.Registrar;

public class Compra {
	
	public static void main(String[] args) {
		 JOptionPane.showMessageDialog(null, "Bem vindo a Cafeteria JAVA", "Bem vindo!", 0, new ImageIcon("C:\\Users\\eteixeira\\Downloads\\javalogo.png"));
		 String opc_ini = JOptionPane.showInputDialog("(1) Entrar \n(2) Não possuo uma conta");
		// String opc_ini = (String) JOptionPane.showInputDialog(null, "(1) Entrar \\n(2) Não possuo uma conta", "Inicio", 0, new ImageIcon("C:\\Users\\eteixeira\\Downloads\\javalogo.png"), args, 0);
		 int opc = Integer.parseInt(opc_ini);
		 if(opc == 1) {
			 EntrarConta entrarConta = new EntrarConta();
			 entrarConta.entrar();
		 }else if(opc == 2) {
			 Registrar registrar = new Registrar();
			 registrar.registrarUsuario();
		 }
		 //Menu menu = new Menu();
		 //Produtos produtos = new Produtos();
		 //produtos.listaProdutos();
		 Menu.menuIncial();
		 
		 ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
		 conexaoMySQL.conectaDB();
	}
	

