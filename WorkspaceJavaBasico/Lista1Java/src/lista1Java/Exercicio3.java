package lista1Java;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
//		Inserir o primerio n�mero
		int [] numero = new int [3];
		for (int i=0; i<3; i++) {
			numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"� n�mero"));
			for(int j=0;j<i;j++) {
				while(numero[i] == numero[j]) {
					numero[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero n�o digitador anteriormente."));
					j = 0;
				}
			}
		}
		String mensagem = "O menor n�mero � ";
		if (numero[0]<numero[1] && numero[0]<numero[2]) {
			mensagem += numero[0];
		}else if(numero[1]< numero[0] && numero[1]< numero[2]){
			mensagem += numero[1];
		}else {
			mensagem += numero[2];
		}
		JOptionPane.showMessageDialog(null, mensagem, "menor n�mero ",JOptionPane.INFORMATION_MESSAGE);
	}
}
/**	int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
//		while (numero2 == numero1) {
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Valor ja existe! Escolha outro n�mero: "));
		}
//		Inserir o terceiro n�mero
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero: "));
		while (numero3 == numero1 || numero3 == numero2) {
			numero3 = Integer.parseInt(JOptionPane.showInputDialog("Valor j� existe! Escolha outro valor: "));
		}
		if (numero1 < numero2 || numero1 < numero3) {
			JOptionPane.showMessageDialog(null, numero1, "O menor n�mero �", JOptionPane.INFORMATION_MESSAGE);
		} else if (numero2 < numero1 || numero2 < numero3) {
			JOptionPane.showMessageDialog(null, numero2, "O menor n�mero �", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, numero3, "O menor n�mero �", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
**/