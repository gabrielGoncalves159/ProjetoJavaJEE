package lista1Java;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
//		Inserindo a maior idade do pais
		int maiorIdade = Integer.parseInt(JOptionPane.showInputDialog("Qual a maioridade de seu pais?: "));
		while (maiorIdade<=0) {
			maiorIdade = Integer.parseInt(JOptionPane.showInputDialog("Valor Incorreto!! Qual a maioridade de seu pais?: "));
		}
//      Inserindo a idade do usuario
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?: "));
		while(idade<=0) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Valor incorreto!! Qual a sua idade?: "));
		}
		if (idade>=maiorIdade) {
			JOptionPane.showMessageDialog(null, "Você é maior de idade!");
		}else {
			JOptionPane.showMessageDialog(null, "Você é menor de idade!");
		}
		

	}

}
