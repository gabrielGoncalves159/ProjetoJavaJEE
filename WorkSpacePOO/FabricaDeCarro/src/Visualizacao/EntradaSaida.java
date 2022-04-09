package Visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() {
		
		String[] opcao = { "Fabricar carros", "Vender um carro", "Ver informações dos carros", "Sair"};
		JComboBox<String> menu = new JComboBox<String>(opcao);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	}
	
	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor do Carro");
	}
	
	public static String solicitaModelo() {
		return JOptionPane.showInputDialog("Informe o Modelo do Carro");
	}
	
	public static String solicitaMarca() {
		return JOptionPane.showInputDialog("Informe a Marca do Carro");
	}
	
	public static int solicaAno() {
		return Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano do Carro"));
	}
	
	public static int solicitaQtdeCarros() {
		return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de Carro(s) que deseja Fabricar"));
	}
}
