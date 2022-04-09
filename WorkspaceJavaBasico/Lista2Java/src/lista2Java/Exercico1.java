
package lista2Java;

import javax.swing.JOptionPane;

public class Exercico1 {

	public static void main(String[] args) {
		int contadora = 0;
		int i = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tamanho de seu vetor:"));
		while (i<0) {
			i = Integer.parseInt(JOptionPane.showInputDialog("Valor Incorreto!!"
					+"\n Escolha o tamanho de seu vetor:"));
		}
		int[] valores = new int [i];
			for (int c=0; c<i;c++) {
				valores[c] = Integer.parseInt(JOptionPane.showInputDialog("Insira o" +(c+1)+"° valores no vetor:"));
				if (valores[c]<0) {
					contadora = contadora + 1;
				}
			}
			JOptionPane.showInternalMessageDialog(null, contadora, "A quantidade de números negativos é:", JOptionPane.INFORMATION_MESSAGE);
	}

}
