package lista1Java;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
//		Inserir o primerio número
		int [] numero = new int [3];
		for (int i=0; i<3; i++) {
			numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"° número"));
			for(int j=0;j<i;j++) {
				while(numero[i] == numero[j]) {
					numero[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite um número não digitador anteriormente."));
					j = 0;
				}
			}
		}
		String mensagem = "O menor número é ";
		if (numero[0]<numero[1] && numero[0]<numero[2]) {
			mensagem += numero[0];
		}else if(numero[1]< numero[0] && numero[1]< numero[2]){
			mensagem += numero[1];
		}else {
			mensagem += numero[2];
		}
		JOptionPane.showMessageDialog(null, mensagem, "menor número ",JOptionPane.INFORMATION_MESSAGE);
	}
}
/**	int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
//		while (numero2 == numero1) {
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Valor ja existe! Escolha outro número: "));
		}
//		Inserir o terceiro número
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
		while (numero3 == numero1 || numero3 == numero2) {
			numero3 = Integer.parseInt(JOptionPane.showInputDialog("Valor já existe! Escolha outro valor: "));
		}
		if (numero1 < numero2 || numero1 < numero3) {
			JOptionPane.showMessageDialog(null, numero1, "O menor número é", JOptionPane.INFORMATION_MESSAGE);
		} else if (numero2 < numero1 || numero2 < numero3) {
			JOptionPane.showMessageDialog(null, numero2, "O menor número é", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, numero3, "O menor número é", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
**/