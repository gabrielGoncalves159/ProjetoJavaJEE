package lista1Java;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		int numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero para iniciar a conta: "));
		int numeroFinal = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero para finalizar a conta: "));
		while(numeroFinal<numeroInicial) {
			numeroFinal = Integer.parseInt(JOptionPane.showInputDialog("N�mero Invalido!! Escolha um n�mero para finalizar a conta: "));
		}
		int somaPar = 0;
		int i;
		for (i=numeroInicial;i<numeroFinal+1;i++) {
			if(i%2 ==0) {
				somaPar = somaPar + i;
			}
		}	
		JOptionPane.showInternalMessageDialog(null, somaPar, "A soma dos n�mero paras �", JOptionPane.INFORMATION_MESSAGE);
	}
}
