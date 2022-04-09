package lista2Java;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		double latao;
		latao = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos quilos de latão deseja fabricar:"));
		
		double cobre = latao * 0.7;
		double zinco = latao * 0.3;
		
		JOptionPane.showInternalMessageDialog(null, cobre, "Quantidade de cobre para produzir"+latao+"Kg de Latão", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, zinco, "Quantidade de cobre para produzir"+latao+"Kg de Latão", JOptionPane.INFORMATION_MESSAGE);
	}

}
