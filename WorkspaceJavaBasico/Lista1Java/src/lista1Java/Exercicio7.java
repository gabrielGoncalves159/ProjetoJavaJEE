package lista1Java;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int[] valores = new int [3];
//		receber e inserir valores no vetor
		for (int i=0;i<3;i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o" +(i+1)+" � valor"));
		}
		int buscar = Integer.parseInt(JOptionPane.showInputDialog("Qual valor deseja saber a po��o?"));
		int i;
		boolean verificador = false;
		for ( i=0;i<3;i++) {
			if (valores[i] == buscar) {
				JOptionPane.showMessageDialog(null, i, "O valor se encontra na posi��o:", JOptionPane.INFORMATION_MESSAGE);
				verificador = true;
			}}
		if(!verificador) {
			JOptionPane.showMessageDialog(null,"N�mero n�o encontrado","",JOptionPane.WARNING_MESSAGE);
		}
		}
	}

		