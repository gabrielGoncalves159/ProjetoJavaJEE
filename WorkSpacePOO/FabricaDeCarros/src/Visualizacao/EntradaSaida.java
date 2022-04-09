package Visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() {
		
		String[] opcao = { "Fabricar carros", "Vender um carro", "Ver informa��es dos carros", "Sair"};
		JComboBox<String> menu = new JComboBox<String>(opcao);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa ser� encerrado!");
	}
	
	public static String solicitaCor(int posicao) {
		return JOptionPane.showInputDialog("Informe a cor do "+ posicao+"� Carro");
	}
	
	public static String solicitaModelo(int posicao) {
		return JOptionPane.showInputDialog("Informe o Modelo do "+ posicao+"� Carro");
	}
	
	public static String solicitaMarca(int posicao) {
		return JOptionPane.showInputDialog("Informe a Marca do "+ posicao+"� Carro");
	}
	
	public static int solicaAno(int posicao) {
		return Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano do "+ posicao+"� Carro"));
	}
	
	public static int solicitaQtdeCarros() {
		return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de Carro(s) que deseja Fabricar"));
	}

	public static void exibeMsgAbertura() {
		JOptionPane.showMessageDialog(null, "Nenhuma carro foi vendido");
		
	}
	public static void exibeInfoCarro(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Informa��es do carro", JOptionPane.INFORMATION_MESSAGE);
	}
}
