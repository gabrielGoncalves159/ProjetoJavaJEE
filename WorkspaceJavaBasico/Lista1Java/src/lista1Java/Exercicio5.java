package lista1Java;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		int i;
		int somaPar = 0;
		int contaPar = 0;
		int contaImpar = 0;
		int somaImpar = 0;
			for (i=0;i<10;i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o"+(i+1)+"� n�mero"));
			while(numero<0) {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Valor Invalido!! Digite o"+(i+1)+"� n�mero"));
			}
			if (numero%2==0) {
				somaPar = somaPar + numero;
				contaPar = contaPar + 1;
			}else {
				somaImpar = somaImpar + numero;
				contaImpar = contaImpar + 1;
			}
		}
		JOptionPane.showInternalMessageDialog(null, somaPar, "Soma dos n�meros pares", JOptionPane.INFORMATION_MESSAGE);	
		JOptionPane.showInternalMessageDialog(null, contaPar, "Quantidade de n�meros Pares", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, somaImpar,"Total de n�meros Impares", JOptionPane.INFORMATION_MESSAGE );
		JOptionPane.showInternalMessageDialog(null, contaImpar,"Quantidade de n�meros Impares", JOptionPane.INFORMATION_MESSAGE);
	}

}
